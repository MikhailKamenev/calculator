package com.example.calculator.controller;

import com.example.calculator.service.ServiceNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class Controller {
    private final ServiceNumber serviceNumber;

    public Controller(ServiceNumber serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return this.serviceNumber.greeting();
    }

    @GetMapping("/sum")
    public double sum(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.sum(num1, num2);
    }

    @GetMapping("/subtraction")
    public double subtraction(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.subtraction(num1, num2);
    }
}
