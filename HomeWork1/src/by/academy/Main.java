package by.academy;

import by.academy.CalculatorWithOperator.CalculatorWithOperator;

public class Main {

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        float result = (float) calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2));
        System.out.println(result);
    }
}
