package by.academy;


import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class AnimalMain {
    public static void main(String[] args) {
        int numberOfAnimals = 10;    //необходимое количество копий

        DataContainer<Animal> animalDataContainer = new DataContainer<>(new Animal[numberOfAnimals]);
        Names name = new Names();
        AgeOfAnimal age = new AgeOfAnimal();
        Comparator<Animal> animalComparator = new AnimalAgeComparator();

        for (int i = 0; i < numberOfAnimals; i++) {
            animalDataContainer.add(new Animal(name.nameRandomizer(), age.getAge()));
        }
        System.out.println(Arrays.toString(animalDataContainer.getData()));

        DataContainer.sort(animalDataContainer,animalComparator);
        System.out.println(Arrays.toString(animalDataContainer.getData()));

    }
}
