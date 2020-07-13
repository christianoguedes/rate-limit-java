package com.example.ratelimit.java.ratelimitjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RateLimitJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateLimitJavaApplication.class, args);
    }

}
