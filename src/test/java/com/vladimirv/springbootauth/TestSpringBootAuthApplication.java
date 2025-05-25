package com.vladimirv.springbootauth;

import org.springframework.boot.SpringApplication;

public class TestSpringBootAuthApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootAuthApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
