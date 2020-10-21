package com.example.boss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.example.boss.mapper")
@EnableTransactionManagement
@ServletComponentScan
public class BossApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossApplication.class, args);
    }

}
