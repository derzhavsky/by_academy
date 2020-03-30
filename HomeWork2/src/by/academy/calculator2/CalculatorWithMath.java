package by.academy.calculator2;

public class CalculatorWithMath implements ICalculator {
    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double exponentiation(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double modulate(double a) {
        return Math.abs(a);
    }

    @Override
    public double koren(double a) {
        int b = 1/2;
        return Math.pow(a, b);
    }
}
