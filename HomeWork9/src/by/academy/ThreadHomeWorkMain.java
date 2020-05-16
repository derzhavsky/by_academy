package by.academy;

import java.util.concurrent.TimeUnit;

public class ThreadHomeWorkMain {

    private static int a = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 100; i++) {
                a += 1;
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.err.println("Что-то работает " + a);
            }
        });

        t1.start();


        int count = 0;
        while (count < 5 && t1.isAlive()) {
            try {
                t1.join(10_000);
                count++;
                System.out.println("Попытка " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count == 5 && t1.isAlive()) {
            System.out.println("Всё плохо");
            t1.stop();
        } else {
            System.out.println("Все ок");
        }
    }


}
