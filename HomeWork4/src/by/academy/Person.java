package by.academy;

import java.time.LocalDate;

public class Person {

    private String nick;
    private int password;
    private LocalDate registration;

    public Person(String nick, int password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password=" + password +
                ", registration=" + registration +
                '}';
    }
}
