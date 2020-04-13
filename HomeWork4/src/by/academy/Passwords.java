package by.academy;
/*
Генерация пароля из 7 цифр
 */


public class Passwords {
    private int password;

    public int getPassword() {
        this.password = (int)((Math.random()*(9999999-1000000))+1000000);
        return password;
    }
}
