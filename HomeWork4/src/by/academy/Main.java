package by.academy;

/*
Класс для проверки и тестирования
 */

public class Main {

    public static void main(String[] args) {
//        Names name = new Names();
//        System.out.println(name.nameRandomizer());
//        Passwords pass = new Passwords();
//        System.out.println(pass.getPassword());
//        Registration reg = new Registration();
//        System.out.println(reg.getRegistration());

        Names name = new Names();
        Passwords password = new Passwords();
        Registration registration = new Registration();

        PersonRegistrationComparator comparator = new PersonRegistrationComparator();

        comparator.compare(new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()),
                new Person(name.nameRandomizer(), password.getPassword(), registration.getRegistration()));


        AgeOfAnimal age = new AgeOfAnimal();
        AnimalAgeComparator ageComparator = new AnimalAgeComparator();
        ageComparator.compare(new Animal(name.nameRandomizer(), age.getAge()),
                new Animal(name.nameRandomizer(), age.getAge()));


    }
}
