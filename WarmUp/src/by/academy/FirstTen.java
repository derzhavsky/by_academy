package by.academy;

public class FirstTen {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile) {
            return true;
        }
        if (aSmile && bSmile) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return (21 - n);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour > 20 || hour < 7)) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if (n <= 100 + 10 && n >= 100 - 10 || n <= 200 + 10 && n >= 200 - 10) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        String s = str.substring(0, n);
        String r = str.substring(n + 1, str.length());
        return s + r;
    }


}

