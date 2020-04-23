package by.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");

        try {

            int num = scanner.nextInt();


            if (num > 0 && num < 11) {
                System.out.println("Ваше число: " + num);
            } else {
                System.err.println("неправильно");

                int num2 = scanner.nextInt();

                if (num2 > 0 && num2 < 11) {
                    System.out.println("Ваше число: " + num2);
                } else {
                    System.err.println("Опять неправильно");

                    int num3 = scanner.nextInt();

                    if (num3 > 0 && num3 < 11) {
                        System.out.println("Ваше число: " + num3);
                    } else {
                        throw new IllegalArgumentException("Ну вот, ошибка...");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Просили же число..");

        }
        scanner.close();
    }

}
