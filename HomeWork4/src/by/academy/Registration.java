package by.academy;

import java.time.LocalDate;

/*
Генерация случайной даты регистрации. Взял только 2019 год.
 */


public class Registration {
    private LocalDate registration;

    private int year;
    private int month;
    private int day;


    public LocalDate getRegistration() {
        this.year = (int) (Math.random() * (2020 - 2019) + 2019);
        this.month = (int) ((Math.random() * 12) + 1);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = (int) ((Math.random() * 31) + 1);
                break;
            case 2:
                day = (int) ((Math.random() * 28) + 1);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = (int) ((Math.random() * 30) + 1);
                break;
        }
        this.registration = LocalDate.of(year, month, day);
        return registration;
    }
}
