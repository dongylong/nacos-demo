package com.nacos.order.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BeanConfiguration {
    @Bean
    @LoadBalanced
    private RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
