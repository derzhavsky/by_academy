package by.academy;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        String studentName1 = s1.getName().toUpperCase();
        String studentName2 = s2.getName().toUpperCase();

        //ascending order
        return studentName1.compareTo(studentName2);

        //descending order
        //return fruitName2.compareTo(fruitName1);
    }
}

