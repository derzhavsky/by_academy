package by.academy;

import java.util.Arrays;
import java.util.Random;

public class ContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> data = new DataContainer<>(new Integer[2]);

        Random rnd = new Random();
        for (int i = 0; i < 1; i++) {
            data.add(rnd.nextInt());
        }
        System.out.println(Arrays.toString(data.getData()));

//        long result = 0;
//        for (Integer datum : data.getData()) {
//            result += datum;
//        }
//
//        System.out.println(result);
    }

}
