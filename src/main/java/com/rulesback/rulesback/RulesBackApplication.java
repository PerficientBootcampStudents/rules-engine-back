package com.rulesback.rulesback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.rulesback.rulesback"})
public class RulesBackApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(RulesBackApplication.class, args);
    }

}
