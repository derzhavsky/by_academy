package by.academy;

import java.util.Comparator;

public class PersonRegistrationComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getRegistration().compareTo(o2.getRegistration()) > 0) {
            System.out.println(o1.getRegistration() + " is after " + o2.getRegistration());
        } else if (o1.getRegistration().compareTo(o2.getRegistration()) < 0) {
            System.out.println(o1.getRegistration() + " is before " + o2.getRegistration());
        } else if (o1.getRegistration().compareTo(o2.getRegistration()) == 0) {
            System.out.println(o1.getRegistration() + " is equal to  " + o2.getRegistration());
        }
        return 0;
    }


}
