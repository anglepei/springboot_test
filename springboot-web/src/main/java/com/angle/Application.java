package com.angle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by liupei on 2017/8/2.
 */
// @EnableAutoConfiguration
@SpringBootApplication
// @ComponentScan
@MapperScan("com.angle.dal")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
