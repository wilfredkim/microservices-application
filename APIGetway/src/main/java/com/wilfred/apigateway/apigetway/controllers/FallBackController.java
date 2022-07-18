package com.wilfred.apigateway.apigetway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/customerServiceFallBack")
    public String customerServiceFallBack() {
        return "Customer Service is down!!, Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return "Department Service is down!!, Please try again later";
    }
}
