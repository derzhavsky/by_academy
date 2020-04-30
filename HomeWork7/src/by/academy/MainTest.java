package by.academy;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("sortedStudents.bin"));

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> hash = new ArrayList<>();

        while (true) {
            try {
                nameList.add(in.readUTF());
                hash.add(in.readInt());
            } catch (EOFException e) {
                break;
            }
        }
        System.out.println(nameList);
        System.out.println(hash);

    }
}
