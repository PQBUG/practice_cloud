package com.imooc.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CourseListApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseListApplication.class, args);
    }
}
