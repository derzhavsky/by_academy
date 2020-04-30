package by.academy;

import java.io.*;
import java.util.ArrayList;


public class MainRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.bin"));

        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            try {
                list.add((Student) in.readObject());
            } catch (EOFException e) {
                break;
            }
        }

//        System.out.println(list);
        list.sort(new NameComparator());
//        System.out.println(list);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortedStudents.bin"));
        for (Student student : list) {
            out.writeBytes(student.getName() + "\n");
        }
        out.close();
    }
}
