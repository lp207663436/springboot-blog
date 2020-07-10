package com.lp.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lp.blog.mapper")
public class BlogSystemApplication {

    public static void main(String[] args) {
            SpringApplication.run(BlogSystemApplication.class, args);
        }

}
