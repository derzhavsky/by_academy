package by.academy;

public class SecondTen {

    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        char s = str.charAt(str.length() - 1);
        String t = str.substring(1, str.length() - 1);
        char r = str.charAt(0);
        return s + t + r;
    }

    public String front3(String str) {
        if (str.length() < 3)
            return str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length());
        String t = str.substring(0, 3);
        return t + t + t;
    }

    public String backAround(String str) {
        char end = str.charAt(str.length() - 1);
        return end + str + end;
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0)
            return true;
        return false;
    }

    public String front22(String str) {
        if (str.length() < 2)
            return str + str + str;
        String begin = str.substring(0, 2);
        return begin + str + begin;
    }

    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("hi"))
            return true;
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0 || temp2 > 100 && temp1 < 0)
            return true;
        return false;
    }

    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20)
            return true;
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19)
            return true;
        return false;
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

}
