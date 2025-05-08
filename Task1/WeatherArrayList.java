package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeatherArrayList extends AbstractWeather {
    private List<Day> list = new ArrayList<Day>();

    public WeatherArrayList(String season, String comment) {
        super(season, comment);
    }

    @Override
    public Day[] getDays() {
        return list.toArray(new Day[0]);
    }

    @Override
    public void setDays(Day[] days) {
        this.list = new ArrayList<>(Arrays.asList(days));
    }

    @Override
    public void addDay(Day day) {
        list.add(day);
    }

    public List<Day> getList() {
        return list;
    }

    public void setList(List<Day> list) {
        this.list = list;
    }

}