package com.microservices.apicloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userservicefallback")
    public String userServiceFallbackMethod() {
        return "User service is taking longer than it should";
    }

    @GetMapping("/departmentservicefallback")
    public String departmentServiceFallbackMethod() {
        return "Department service is taking longer than it should";
    }
}
