package com.doporro.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.doporro.core")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
