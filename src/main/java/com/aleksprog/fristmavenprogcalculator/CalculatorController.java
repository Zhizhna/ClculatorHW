package com.aleksprog.fristmavenprogcalculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aleksprog.fristmavenprogcalculator.service.CalculatorService;

@RestController
@RequestMapping("calculator)"
public class CalculatorController{

    private final CalculatorService calculatorService;


 public CalculatorController(CalculatorService calculatorService){
     this.calculatorService = calculatorService;
 }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public String add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.add(num1, num2);
    }

    @GetMapping("minus")
    public String subtraction(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping("multiply")
    public String multiplication(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiplication(num1, num2);
    }

    @GetMapping("divide")
    public String division(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        double result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + calculatorService.division(num1, num2);
    }
}
