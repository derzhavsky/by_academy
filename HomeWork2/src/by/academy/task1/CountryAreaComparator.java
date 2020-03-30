package by.academy.task1;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if (o1.area > o2.area) {
            return o1.area;
        } else if (o1.area < o2.area) {
            return o2.area;
        } else {
            return 0;
        }
    }

}
