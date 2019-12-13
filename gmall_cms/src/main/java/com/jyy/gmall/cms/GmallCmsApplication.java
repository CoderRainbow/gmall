package com.jyy.gmall.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.jyy.gmall.cms.mapper")
@SpringBootApplication
public class GmallCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCmsApplication.class, args);
    }

}
