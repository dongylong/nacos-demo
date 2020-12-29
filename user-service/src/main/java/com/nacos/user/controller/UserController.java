package com.nacos.user.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    String portId;

    @GetMapping("/port/{id}")
    public String getInfo(@PathVariable("id") Integer id) {
        return "port:" + portId + ".....id:" + id;
    }
}
