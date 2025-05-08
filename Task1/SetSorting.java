package Task1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;

public class SetSorting {

    public static void sortByTemperature(WeatherSortedSet weather) {
        SortedSet<Day> newSet = new TreeSet<>();
        newSet.addAll(Arrays.asList(weather.getDays()));
        weather.setDays(newSet.toArray(new Day[0]));
    }

    public static void sortByComments(WeatherSortedSet weather) {
        SortedSet<Day> newSet = new TreeSet<>(Comparator.comparing(Day::getComment));
        newSet.addAll(Arrays.asList(weather.getDays()));
        weather.setDays(newSet.toArray(new Day[0]));
    }
}