package by.academy.task2;
/*
Поиск числа в массиве, которое встречается нечетное количество раз
*/
public class Main {
    public static void main(String[] args) {
        int[] matrixOne = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] matrixTwo = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] matrixTrinity = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] matrixFour = {10};
        int[] matrixFive = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] matrixSix = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};

        Matrix matrix = new Matrix();

        matrix.findNumber(matrixOne);
        matrix.findNumber(matrixTwo);
        matrix.findNumber(matrixTrinity);
        matrix.findNumber(matrixFour);
        matrix.findNumber(matrixFive);
        matrix.findNumber(matrixSix);
    }
}
