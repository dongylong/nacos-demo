package com.nacos.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
public class UserServiceMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        LOGGER.info("UserService - 开始启动");
        try {
            SpringApplication.run(UserServiceMain.class, args);
        } catch (Exception e) {
            LOGGER.error("UserService - 启动失败:{}", e.getMessage());
            LOGGER.error("UserService - 启动失败", e);
            throw new RuntimeException("UserService - 启动失败");
        }
        LOGGER.info("UserService - 启动成功");
    }

}
