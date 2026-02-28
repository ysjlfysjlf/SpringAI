package com.springai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.springai.mapper")
@SpringBootApplication
public class SpringaiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringaiDemoApplication.class, args);
    }

}
