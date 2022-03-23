package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
      // Calculator calculator= new calculator.substractMethod()
       int a=10;
       int b=7;

       System.out.println("Sum of a and b is: " + (calculator.a + calculator.b));
       System.out.println("Sum of two int is: " + calculator.sumMethod(12,8));
       System.out.println("Substract of two int is: " + calculator.substractMethod(15,14));

    }

}
