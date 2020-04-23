package by.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLessonAtHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int chance = 3;
        do {
            try {
                System.out.println("Угадай число от 1 до 10 с " + chance + " попыток: ");
                int num = scanner.nextInt();
                checkNumber(num);
                System.out.println("Правильно, " + num);
                break;
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.err.println("Не угадал..");
                scanner = new Scanner(System.in);
                counter++;
                chance--;
            }
        } while (counter < 3);
    }

    public static void checkNumber(int num) {

        if (num < 1 || num > 10) {
            throw new IllegalArgumentException();
        }

    }
}
