package com.graphQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class graphQLMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(graphQLMain.class,args);
    }
}
