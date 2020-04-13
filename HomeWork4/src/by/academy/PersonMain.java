package by.academy;

import java.util.Arrays;

public class PersonMain {

    public static void main(String[] args) {
       int numberOfPersons = 4;                                  //необходимое количество копий

        DataContainer<Person> personDataContainer = new DataContainer<>(new Person[numberOfPersons]);
        Names name = new Names();
        Passwords password = new Passwords();
        Registration registration = new Registration();

        for (int i = 0; i < numberOfPersons; i++) {
            personDataContainer.add(new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()));
        }
        System.out.println(Arrays.toString(personDataContainer.getData()));
    }
}
