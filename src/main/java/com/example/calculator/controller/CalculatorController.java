package com.example.calculator.controller;

import com.example.calculator.service.ServiceNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    private final ServiceNumber serviceNumber;

    public CalculatorController(ServiceNumber serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return this.serviceNumber.greeting();
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.sum(num1, num2);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return this.serviceNumber.divide(num1, num2);
    }
}
