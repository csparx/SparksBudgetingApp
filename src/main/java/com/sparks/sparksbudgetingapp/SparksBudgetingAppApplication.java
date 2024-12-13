package com.sparks.sparksbudgetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sparks.sparksbudgetingapp"})
public class SparksBudgetingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparksBudgetingAppApplication.class, args);
    }

}
