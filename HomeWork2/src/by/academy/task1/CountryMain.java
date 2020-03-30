package by.academy.task1;

public class CountryMain {
    public static void main(String[] args) {

//        Country[] countries = Country.values();
//        for (Country c : countries) {
//            System.out.println(c);
//        }

        System.out.println("Country:" + Country.BELARUS + " Area:" + Country.BELARUS.getArea() + " Population:" + Country.BELARUS.getPopulation());

        String country1 = "BELARUS";
        Country country0 = Country.valueOf(country1);
        System.out.println(country0 == Country.BELARUS);                     //true
        System.out.println(Country.BELARUS.compareTo(Country.ITALY));        //compareTo сравнило позицию в списке (0-1)=-1


        String country2 = "DENMARK";
        //      Country country3 = Country.valueOf(country2);
        //      System.out.println(country2);                                     // получаем ошибку No enum constant by.academy.task1.Country.DENMARK


        CountryAreaComparator areaComparator = new CountryAreaComparator();
        System.out.println("Наибольшая площадь из двух составляет: " + areaComparator.compare(Country.ITALY, Country.BELARUS) + " кв.километров");
    }
}
