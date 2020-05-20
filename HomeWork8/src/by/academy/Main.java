package by.academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Илья, мы вроде рзобралиьм на занятии, но я нихера не сделал.
Обещаю, то еще раз разберусь и сделаю это дз. Сейчас реально нет времени из-за основной работы.
А спать очень хочется и мозг не варит.
*
* */


public class Main {

    public static void main(String[] args) {
        String urls =
                "http://cdcsdvf.er.ru" +
                        "https://www.cdc131--sdvf.er.com" +
                        "http://www.234.cdc131--sd23423f.er.ru" +
                        "http://cdc131--sdvf.er.vre.com" +
                        "ftp://cdc2342342341--sdvf.er.vre.ru";


        Pattern pattern = Pattern.compile("(http|https|ftp)://\\\\w");
        //(http|https|ftp)://{\\w})
        Matcher matcher = pattern.matcher(urls);


        while (matcher.find()) {
            System.out.println("Сайт: " + matcher.group(0)); // тут надо вывести адрес
            System.out.println("Сайт: " + matcher.groupCount());//добавить ТОП протоколов
            //добавить ТОП доменов
            //добавить ТОП национальных доменов

            matcher.find();
            matcher.matches();

        }


    }
}
