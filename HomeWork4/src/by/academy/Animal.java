package by.academy;

public class Animal {
    private int age;
    private String nick;

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
