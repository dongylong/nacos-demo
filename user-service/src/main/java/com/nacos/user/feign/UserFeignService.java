package com.nacos.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", contextId = "userFeignService", path = "/user")
public interface UserFeignService {
    @GetMapping("/port/{id}")
     String getInfo(@PathVariable("id") Integer id);
}
