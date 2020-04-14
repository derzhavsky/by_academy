package by.academy;

/*
Класс для проверки и тестирования
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Names name = new Names();
//        System.out.println(name.nameRandomizer());
//        Passwords pass = new Passwords();
//        System.out.println(pass.getPassword());
//        Registration reg = new Registration();
//        System.out.println(reg.getRegistration());
//
//        Names name = new Names();
//        Passwords password = new Passwords();
//        Registration registration = new Registration();
//
//        PersonRegistrationComparator comparator = new PersonRegistrationComparator();
//
//        comparator.compare(new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()),
//                new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()));
//
//
//        AgeOfAnimal age = new AgeOfAnimal();
//        AnimalAgeComparator ageComparator = new AnimalAgeComparator();
//        ageComparator.compare(new Animal(name.nameRandomizer(), age.getAge()),
//                new Animal(name.nameRandomizer(), age.getAge()));

        DataContainer <Animal> animalDataContainer = new DataContainer<Animal>(new Animal[3]);
        Animal ben = new Animal("ben",14);
        Animal bill = new Animal("bill",8);
        Animal ivan = new Animal("ivan",10);
        Animal valera = new Animal("valera",10);
        Animal petya = new Animal("petya",10);
        Animal igor = new Animal("igor",10);


        animalDataContainer.add(ben);
        animalDataContainer.add(valera);
        animalDataContainer.add(bill);
        animalDataContainer.add(ivan);
        animalDataContainer.add(petya);
        animalDataContainer.add(igor);

        System.out.println(Arrays.toString(animalDataContainer.getData()));

        animalDataContainer.delete(bill);
        System.out.println(Arrays.toString(animalDataContainer.getData()));



    }
}
