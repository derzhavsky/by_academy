package by.academy;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {

    public static void main(String[] args) {
       int numberOfPersons = 5;                                  //необходимое количество копий

        DataContainer<Person> personDataContainer = new DataContainer<>(new Person[numberOfPersons]);
        Names name = new Names();
        Passwords password = new Passwords();
        Registration registration = new Registration();
        Comparator<Person> personComparator = new PersonRegistrationComparator();

        for (int i = 0; i < numberOfPersons; i++) {
            personDataContainer.add(new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()));
        }
        System.out.println(Arrays.toString(personDataContainer.getData()));
        DataContainer.sort(personDataContainer,personComparator);
        System.out.println(Arrays.toString(personDataContainer.getData()));
        personDataContainer.delete(2);
        System.out.println(Arrays.toString(personDataContainer.getData()));

    }
}
