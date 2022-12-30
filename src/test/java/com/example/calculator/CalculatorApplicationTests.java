package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
    private double num1;
    private double num2;

    @BeforeEach
    public void setUp() {
        num1 = 10;
        num2 = 5;
    }
    @Test
    public void testSum() {
        double sum =15;
        Assertions.assertEquals(sum,num1+num2);
    }
    @Test
    public void testSubtract() {
        double subtract = 5;
        Assertions.assertEquals(subtract,num1-num2);
    }
    @Test
    public void testMultiply() {
        double multiplication = 50;
        Assertions.assertEquals(multiplication,num1*num2);
    }
    @Test
    public void testDivide() {
        double divide = 2;
        Assertions.assertEquals(divide,num1/num2);
    }

}
