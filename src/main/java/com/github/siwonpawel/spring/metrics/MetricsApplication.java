package com.github.siwonpawel.spring.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class MetricsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetricsApplication.class, args);
    }

}
