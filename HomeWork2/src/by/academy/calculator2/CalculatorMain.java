package by.academy.calculator2;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        float result = (float) calculator1.addition(calculator1.addition(4.1, calculator1.multiplication(15, 7)), calculator1.exponentiation(calculator1.division(28, 5), 2));
        System.out.println("ответ: " + result);
        System.out.println(calculator1.division(result, 0));  //infinity
        System.out.println(calculator1.division(result, 0.0d)); //infinity

        CalculatorWithMath calculator2 = new CalculatorWithMath();
        System.out.println("ответ: " + (float) calculator2.addition(calculator2.addition(4.1, calculator2.multiplication(15, 7)), calculator2.exponentiation(calculator2.division(28, 5), 2)));
    }
}
