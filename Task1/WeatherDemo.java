package Task1;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class WeatherDemo {
    public static void testSearch(AbstractWeather weather) {
        Day[] days = weather.getDays();
        double sum = 0;
        Day maxTempDay = days[0];
        Day longestCommentDay = days[0];
        for (Day d : days) {
            sum += d.getTemperature();
            if (d.getTemperature() > maxTempDay.getTemperature()) maxTempDay = d;
            if (d.getComment().length() > longestCommentDay.getComment().length()) longestCommentDay = d;
        }
        double avg = sum / days.length;
        System.out.printf("[%s] Average temperature: %.2f°\n", weather.getSeason(), avg);
        System.out.printf("[%s] Day with highest temperature: %s\n", weather.getSeason(), maxTempDay);
        System.out.printf("[%s] Day with longest comment: %s\n", weather.getSeason(), longestCommentDay);
    }


    public static void testSorting(WeatherArrayList weather) {
        List<Day> list = weather.getList();
        Collections.sort(list);
        System.out.println("ArrayList after sorting by temperature desc:");
        list.forEach(System.out::println);
        list.sort(Comparator.comparing(Day::getComment));
        System.out.println("ArrayList after sorting by comment alphabetically:");
        list.forEach(System.out::println);
    }
}
