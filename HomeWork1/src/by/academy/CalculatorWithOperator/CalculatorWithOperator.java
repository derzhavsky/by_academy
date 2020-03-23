package by.academy.CalculatorWithOperator;

public class CalculatorWithOperator {

    public double division(double a, double b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double exponentiation(double a, int b) {

        switch (b) {
            case 1:
                a = a * 1;
                break;
            case 2:
                a = a * a;
                break;
            case 3:
                a = a * a * a;
                break;
            default:
                System.out.println("Введите степень от 1 до 3");
        }
        return a;
    }

    public double modulate(double a) {
        double module;
        if (a < 0) {
            module = a * (-1);
        } else {
            module = a;
        }
        return module;
    }

//    public int koren(int a) {
//        int b;
//        int c;
//        a = b*c;
//
//        if (a % b == 0 && b / c == 1 && a % c == 0) ;
//        return b;
//        return c;
//    }
}
