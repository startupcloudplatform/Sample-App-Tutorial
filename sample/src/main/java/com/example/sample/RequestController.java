package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RefreshScope
public class RequestController {

    @Autowired
    private RequestService requestService;

    /**
     * /api/sido 컨트롤러
     * @param areaList
     * @return
     */
    @GetMapping("/api/sido")
    public @ResponseBody
    Object getDongList(
            @RequestParam(value="wantedAreaList") List<String> areaList
    ) {
        System.out.println("Controller api/sido");
        return requestService.getDongList(areaList);
    }

    /**
     * /api/sangho 컨트롤러
     * @param dong
     * @param business
     * @return
     */
    @GetMapping("/api/sangho")
    public @ResponseBody
    Object getBusinessDetail(
            @RequestParam(value="wantedDong") String dong,
            @RequestParam(value="wantedBusiness") String business
    ) {
        System.out.println("Controller api/sangho");
        return requestService.getBusinessDetail(dong, business);
    }
}

