package com.example.calculator.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceNumber {
    public String greeting() {
        return "Welcome to calculator";
    }

    public double sum(double num1,double num2) {
        return num1+num2;
    }

    public double subtraction(Double num1, Double num2) {
        return num1-num2;
    }
}
