package by.academy;
/*
Генерация случайного возраста животного от 1 до 20
 */
public class AgeOfAnimal {
    private int age;

    public int getAge() {
        age = (int)((Math.random()*20)+1);
        return age;
    }
}
