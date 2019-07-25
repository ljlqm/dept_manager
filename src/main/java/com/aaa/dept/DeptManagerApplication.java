package com.aaa.dept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.aaa.dept.dao")
public class DeptManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptManagerApplication.class, args);
    }

}
