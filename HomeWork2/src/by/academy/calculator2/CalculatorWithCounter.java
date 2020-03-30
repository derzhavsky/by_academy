package by.academy.calculator2;

public class CalculatorWithCounter implements ICalculator {

    private int countOperation = 0;
    private ICalculator calculator;

    public CalculatorWithCounter(ICalculator calculator) {
        this.calculator = calculator;
    }

    public int getCountOperation() {
        return countOperation;
    }


    @Override
    public double division(double a, double b) {
        countOperation++;
        return calculator.division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        countOperation++;
        return calculator.multiplication(a, b);
    }

    @Override
    public double addition(double a, double b) {
        countOperation++;
        return calculator.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        countOperation++;
        return calculator.subtraction(a, b);
    }

    @Override
    public double exponentiation(double a, int b) {
        countOperation++;
        return calculator.exponentiation(a, b);
    }

    @Override
    public double modulate(double a) {
        countOperation++;
        return calculator.modulate(a);
    }

    @Override
    public double koren(double a) {
        countOperation++;
        return calculator.koren(a);
    }
}
