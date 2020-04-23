package by.academy;

public class MainStack {
    public static void main(String[] args) {

        try {
            overload();
        } catch (StackOverflowError e) {
            System.err.println("Поломочка вышла");
        }

    }

    public static void overload() {
        while (true)
            overload();
    }
}
