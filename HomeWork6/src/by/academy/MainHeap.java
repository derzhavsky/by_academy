package by.academy;

import java.util.LinkedList;
import java.util.List;

public class MainHeap {

    public static void main(String[] args) {

        try {
            overload();
        } catch (OutOfMemoryError e) {
            System.err.println("Ой-ой, что-то пошло не так");
        }

    }


    public static void overload() {
        List<Object[]> arr = new LinkedList<>();
        while (true) {
            arr.add(new Object[1000]);
        }
    }
}
