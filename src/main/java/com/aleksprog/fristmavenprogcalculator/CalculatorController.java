package com.aleksprog.fristmavenprogcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorMain calculator;

    public CalculatorController() {
        this.calculator = new CalculatorMain();
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String addition(@RequestParam int num1, @RequestParam int num2) {
        int result = calculator.add(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
//
    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam int num1, @RequestParam int num2) {
        int result = calculator.subtract(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiplication(@RequestParam int num1, @RequestParam int num2) {
        int result = calculator.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String division(@RequestParam int num1, @RequestParam int num2) {
        double result = calculator.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}

