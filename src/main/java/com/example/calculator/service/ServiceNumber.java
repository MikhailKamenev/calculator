package com.example.calculator.service;


import org.springframework.stereotype.Service;

@Service
public class ServiceNumber {
    public String greeting() {
        return "Welcome to calculator";
    }

    public double sum(Double num1,Double num2) {
        return num1+num2;
    }

    public double subtract(Double num1, Double num2) {
        return num1-num2;
    }

    public double multiply(Double num1, Double num2) {
        return num1*num2;
    }

    public double divide(Double num1,Double num2) {
        return num1/num2;
    }
}
