package ru.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Application {
    @Transactional
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
