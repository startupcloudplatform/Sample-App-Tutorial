package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
    @EnableDiscoveryClient
    Eureka 서버가 서비스를 탐색할 때 사용한다.
    Eureka client설정: Eureka Server가 작동하고 있는 상태에서 Eureka client를 시작하면 Eureka Server의 Registry에 등록된다.

    @EnableDiscoveryClient을 활성화시킨 상태에서서 RestTemplate Bean 에 @LoadBalanced만 달아주면 모든 설정을 Spring Boot에서
    자동으로 해준다.
*/
@EnableDiscoveryClient
@SpringBootApplication
public class SampleApplication {
    /*
    마이크로서비스 환경에서 효과적으로 사용하기 위해서는, @LoadBalanced 어노테이션을 사용해야 한다.
    이 어노테이션 덕분에, Netflix Ribbon을 자동적으로 사용할 수 있게 되고, 서비스 발견을 IP대신 서비스 이름으로 할 수 있게 된다.
     */
    @LoadBalanced
    @Bean
    /*
    마이크로서비스 통신을 도와주는 컴포넌트: RestTemplate
    클라이언트가 RESTful webservice를 쓰기 위해서 사용하는 클래스이다. Spring Web 프로젝트에 포함되어 있다.
     */
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}

/*
    Swagger는 프로젝트에서 지정한 URL을 HTML화면으로 확인할 수 있게 한다.
 */
@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                //getMapping부분과 맞춰줘야 한다.
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
}