package by.academy;

public class ThirdEleven {

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        if (c > b && c > a) ;
        return c;
    }

    public int close10(int a, int b) {
        int c = 0;
        if (Math.abs(a - 10) > Math.abs(b - 10))
            return b;
        if (Math.abs(a - 10) < Math.abs(b - 10))
            return a;
        if (Math.abs(a - 10) == Math.abs(b - 10)) ;
        return c;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50)
            return true;
        return false;
    }

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20)
            return a;
        if (b >= 10 && b <= 20)
            return b;
        return 0;
    }

    public boolean stringE(String str) {
        int e = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') e++;
        }
        return (e >= 1 && e <= 3);
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) return true;
        return false;
    }

    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        String beg = str.substring(0, str.length() - 3);
        String end = str.substring(str.length() - 3);
        String up = end.toUpperCase();
        return beg + up;
    }

    public String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i = i + n) {
            s = s + str.charAt(i);
        }
        return s;

    }


}
