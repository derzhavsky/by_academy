package by.academy.calculator2;


public class CounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator1 = new CalculatorWithCounter(new CalculatorWithOperator());
        System.out.println("ответ: " + (float) calculator1.addition(calculator1.addition(4.1, calculator1.multiplication(15, 7)), calculator1.exponentiation(calculator1.division(28, 5), 2)));
        System.out.println("количество операций: " + calculator1.getCountOperation());


        CalculatorWithCounter calculator2 = new CalculatorWithCounter(new CalculatorWithMath());
        System.out.println("ответ: " + (float) calculator2.addition(calculator2.addition(4.1, calculator2.multiplication(15, 7)), calculator2.exponentiation(calculator2.division(28, 5), 2)));
        System.out.println("количество операций: " + calculator2.getCountOperation());

    }

}
