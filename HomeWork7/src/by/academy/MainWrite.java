package by.academy;

import java.io.*;

public class MainWrite {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.bin"));
        RandomName name = new RandomName();

        for (int i = 0; i < 100_000; i++) {
            Student student = new Student(name.nameRandomizer());
            out.writeObject(student);
        }
        out.close();
    }
}
