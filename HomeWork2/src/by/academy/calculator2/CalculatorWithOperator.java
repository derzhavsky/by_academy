package by.academy.calculator2;

public class CalculatorWithOperator implements ICalculator {

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

        double result = 1;
        if (b == 0) {
            return 1;
        }
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else {
            for (int i = 0; i < b; i++) {
                result *= 1 / a;
            }
        }
        return result;
    }

    @Override
    public double modulate(double a) {
        double module;
        if (a < 0) {
            module = a * (-1);
        } else {
            module = a;
        }
        return module;
    }

    @Override
    public double koren(double a) {
        int b = 1 / 2;
        return Math.pow(a, b);

    }

}
