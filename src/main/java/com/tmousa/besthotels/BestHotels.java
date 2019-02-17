package com.tmousa.besthotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BestHotels {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BestHotels.class, args);
    }
}
