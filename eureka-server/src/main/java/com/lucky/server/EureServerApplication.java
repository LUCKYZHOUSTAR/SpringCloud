package com.lucky.server;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/11/2 13:35
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 重要的事情说三遍：
 * 文档地址： http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html
 */
@SpringBootApplication
@EnableEurekaServer
public class EureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureServerApplication.class, args);
    }
}
