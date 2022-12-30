package com.example.calculator.service;


import com.example.calculator.exceptions.AbsenceNumberException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class ServiceNumber {
    public String greeting() {
        return "Welcome to calculator";
    }
//    @ExceptionHandler  попытался сделать чтобы при выполнении приложения выкидывало ошибку с моим описанием..
//    но не очень работает.

    public String sum(Double num1,Double num2) {
        Double sum = num1+num2;
        if (num1 == null || num2 == null) {
            throw new AbsenceNumberException("Отсутсвует одно или несколько чисел, необходимых для выполнения задачи");
        }
        return num1.toString()+"+"+num2.toString()+"="+sum.toString();
    }

    public String subtract(Double num1, Double num2) {
        Double subtract = num1-num2;
        if (num1 == null || num2 == null) {
            throw new AbsenceNumberException("Отсутсвует одно или несколько чисел, необходимых для выполнения задачи");
        }
        return num1.toString()+"-"+num2.toString()+"="+subtract.toString();
    }

    public String multiply(Double num1, Double num2) {
        Double multiplication = num1*num2;
        if (num1 == null || num2 == null) {
            throw new AbsenceNumberException("Отсутсвует одно или несколько чисел, необходимых для выполнения задачи");
        }
        return num1.toString()+"*"+num2.toString()+"="+multiplication.toString();
    }

    public String divide(Double num1,Double num2) {
        Double divide=num1/num2;
        if (num1 == null || num2 == null) {
            throw new AbsenceNumberException("Отсутсвует одно или несколько чисел, необходимых для выполнения задачи");
        } else if (num2 == 0) {
            throw new AbsenceNumberException("На ноль делить нельзя");
        }
        return num1.toString()+"/"+num2.toString()+"="+divide.toString();
    }
}
