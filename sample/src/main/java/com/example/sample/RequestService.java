package com.example.sample;

import com.example.sample.Domain.AnkusResultSangho;
import com.example.sample.Domain.AnkusResultSido;
import com.example.sample.Domain.Dong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RestTemplate searchClient;
    //마이크로서비스 config쪽에서 basic auth정보를 가져온다.
    @Value("${gateway.basic.user: }")
    String user;

    @Value("${gateway.basic.password:}")
    String password;

    Object responseReturn = null;

    private String basicUrl = "http://apigateway/ankus-microservice";

    /**
     * HttpHeader에 BasicAuth를 추가하는 함수
     * @return
     */
    private HttpHeaders getHeaders(){
        String basicAuth = String.format("%s:%s", user, password);
        String base64Auth = Base64Utils.encodeToString(basicAuth.getBytes());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", String.format("Basic %s", base64Auth));
        postConstruct();
        return headers;
    }

    /**
     * "/api/sido" Service
     * @param areaList
     * @return
     */
    public Object getDongList( List<String> areaList ) {
        System.out.println("request api/sido");
        try{
            HttpEntity request = new HttpEntity(getHeaders());

            //http://[게이트웨이]/[해당 서비스에 맞는 path]/[해당 서비스에서 제공하는 API]
            URI uri = URI.create(basicUrl + "/api/dong");

            List<Dong> totalList = new ArrayList<>();
            for(String testArea :areaList) {
                UriComponents requestUri = UriComponentsBuilder.fromHttpUrl(String.valueOf(uri)).
                        queryParam("sido", testArea).build().encode("UTF-8");

                System.out.println("===Uri==="+requestUri);
                ResponseEntity<AnkusResultSido> response = searchClient.exchange(requestUri.toUri(), HttpMethod.GET, request, AnkusResultSido.class);

                //데이터를 받아온 후에 데이터 정리
                if(areaList.size() == 1) {
                    System.out.println("areaList size == 1");
                    responseReturn = response.getBody().getList().subList(16,26); //[16-26]
                    System.out.println("test not_alive_ratio" +
                            response.getBody().getList().subList(0,1).get(0).getNot_alive_ratio().toString());
                }
                else {
                    System.out.println("areaList size > 1");
                    totalList.addAll(response.getBody().getList().subList(0,3));
                    responseReturn = totalList;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return responseReturn;
    }

    /**
     * "/api/sangho" Service
     * @param dong
     * @param business
     * @return
     */
    public Object getBusinessDetail( String dong, String business) {
        System.out.println("request api/sangho");
        try {
            HttpEntity request = new HttpEntity(getHeaders());
            URI uri = URI.create(basicUrl + "/api/sangho");
            UriComponents requestUriSangho = UriComponentsBuilder.fromHttpUrl(String.valueOf(uri)).
                    queryParam("dong", dong).
                    queryParam("upjong", business).build().encode("UTF-8");

            ResponseEntity<AnkusResultSangho> response = searchClient.exchange(requestUriSangho.toUri(), HttpMethod.GET, request, AnkusResultSangho.class);
            responseReturn = response.getBody().getList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return responseReturn;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(">>Basic Auth user/password: " + user + "/" + password);
    }
}
