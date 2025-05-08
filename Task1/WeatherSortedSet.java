package Task1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class WeatherSortedSet extends AbstractWeather {
    private SortedSet<Day> days;

    public WeatherSortedSet(String season, String comment, Comparator<Day> comparator) {
        super(season, comment);
        this.days = new TreeSet<>(comparator);
    }

    @Override
    public Day[] getDays() {
        return days.toArray(new Day[0]);
    }

    @Override
    public void setDays(Day[] days) {
        this.days.clear();
        for (Day day : days) {
            this.days.add(day);
        }
    }

    public void addDay(Day day) {
        days.add(day);
    }

}