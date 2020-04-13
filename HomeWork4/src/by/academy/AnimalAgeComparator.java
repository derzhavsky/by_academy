package by.academy;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() > o2.getAge()) {
            System.out.println(o1.getAge() + " is older than " + o2.getAge());
        } else if (o1.getAge() < o2.getAge()) {
            System.out.println(o1.getAge() + " is younger than " + o2.getAge());
        } else if (o1.getAge() == o2.getAge()) {
            System.out.println(o1.getAge() + " is equal to " + o2.getAge());
        }
        return 0;
    }
}

