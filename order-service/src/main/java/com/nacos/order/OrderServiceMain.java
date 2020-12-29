package com.nacos.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        LOGGER.info("OrderService - 开始启动");
        try {
            SpringApplication.run(OrderServiceMain.class, args);
        } catch (Exception e) {
            LOGGER.error("OrderService - 启动失败-msg:{}", e.getMessage());
            LOGGER.error("OrderService - 启动失败", e);
            throw new RuntimeException("OrderService - 启动失败");
        }
        LOGGER.info("OrderService - 启动成功");
    }

}
