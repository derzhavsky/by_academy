package by.academy;

public class Main {

    public static void main(String[] args) {

        FirstTen first = new FirstTen();
        System.out.println(first.sleepIn(false, false));
        System.out.println(first.monkeyTrouble(false, false));
        System.out.println(first.sumDouble(2, 2));
        System.out.println(first.diff21(1));
        System.out.println(first.parrotTrouble(true, 21));
        System.out.println(first.makes10(1, 1));
        System.out.println(first.nearHundred(110));
        System.out.println(first.posNeg(1,2,false));
        System.out.println(first.notString("me"));
        System.out.println(first.missingChar("Ooops",2));

        SecondTen second = new SecondTen();
        System.out.println(second.frontBack("HaHaHa"));
        System.out.println(second.front3("Java"));
        System.out.println(second.backAround("Hello"));
        System.out.println(second.or35(5));
        System.out.println(second.front22("Ha"));
        System.out.println(second.startHi("Java"));
        System.out.println(second.icyHot(21,-5));
        System.out.println(second.in1020(10,20));
        System.out.println(second.hasTeen(13,25,43));
        System.out.println(second.loneTeen(15,22));

        ThirdEleven third = new ThirdEleven();
        System.out.println(third.delDel("Javac"));
        System.out.println(third.mixStart("Hello"));
        System.out.println(third.startOz("Ozzy"));
        System.out.println(third.intMax(3,4,6));
        System.out.println(third.close10(10,15));
        System.out.println(third.in3050(30,45));
        System.out.println(third.max1020(10,20));
        System.out.println(third.stringE("Heeeelllooo"));
        System.out.println(third.lastDigit(17,29));
        System.out.println(third.endUp("Javajava"));
        System.out.println(third.everyNth("Hello world",7));
    }
}
