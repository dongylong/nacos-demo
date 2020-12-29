package com.nacos.order.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Value("${server.port}")
    private String portId;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/port/{id}")
    public String getInfo(@PathVariable("id") Integer id) {
        return "port:" + portId+".....id:"+id;
    }

    @GetMapping("/user/info/{id}")
    public String queryUserInfo(@PathVariable("id") Integer id) {
        return "port:" + restTemplate.getForObject(userServiceUrl+"/port/"+id,String.class);
    }

}
