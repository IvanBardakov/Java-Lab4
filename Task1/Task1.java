package Task1;

import java.time.LocalDate;
import java.util.Comparator;


class Task1 {
    public static void main(String[] args) {
        WeatherArrayList listWeather = new WeatherArrayList("Summer", "Summer weather");
        WeatherSortedSet setWeather = new WeatherSortedSet("Summer", "Summer weather", Comparator.naturalOrder());

        Day[] sampleDays = new Day[] {
                new Day(LocalDate.of(2025, 7, 1), 30.5, "Clear and sunny"),
                new Day(LocalDate.of(2025, 7, 2), 28.0, "Partly cloudy with sunny intervals"),
                new Day(LocalDate.of(2025, 7, 3), 35.2, "Heavy rain throughout the day with strong winds"),
                new Day(LocalDate.of(2025, 7, 4), 29.0, "Light showers"),
        };
        for (Day d : sampleDays) {
            listWeather.addDay(d);
            setWeather.addDay(d);
        }

        System.out.println("--- TEST SEARCH ---");
        System.out.println("--- ArrayList Search ---");
        WeatherDemo.testSearch(listWeather);
        System.out.println("--- Set Search ---");
        WeatherDemo.testSearch(setWeather);

        System.out.println("--- TEST SORTING ArrayList ---");
        WeatherDemo.testSorting(listWeather);

        System.out.println("--- TEST SORTING Set via SetSorting ---");
        SetSorting.sortByTemperature(setWeather);
        System.out.println("After sortByTemperature on Set:");
        System.out.println(setWeather);
        SetSorting.sortByComments(setWeather);
        System.out.println("After sortByComments on Set:");
        System.out.println(setWeather);
    }
}
