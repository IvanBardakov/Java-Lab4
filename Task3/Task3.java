package Task3;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(3, -1, 0, 5, -2, 0, 7, -3);
        System.out.println("Integer list: " + intList);
        System.out.println("First zero index: " + NumberListUtils.findFirstZeroIndex(intList));
        System.out.println("Number of negatives: " + NumberListUtils.countNegatives(intList));
        System.out.println("Last negative: " + NumberListUtils.getLastNegative(intList));
        System.out.println();

        List<Double> doubleList = List.of(1.5, -2.3, 0.0, 4.7, -0.5, 3.2);
        System.out.println("Double list: " + doubleList);
        System.out.println("First zero index: " + NumberListUtils.findFirstZeroIndex(doubleList));
        System.out.println("Number of negatives: " + NumberListUtils.countNegatives(doubleList));
        System.out.println("Last negative: " + NumberListUtils.getLastNegative(doubleList));
        System.out.println();

        List<Long> longList = List.of(10L, -5L, 0L, 20L, -15L, 30L);
        System.out.println("Long list: " + longList);
        System.out.println("First zero index: " + NumberListUtils.findFirstZeroIndex(longList));
        System.out.println("Number of negatives: " + NumberListUtils.countNegatives(longList));
        System.out.println("Last negative: " + NumberListUtils.getLastNegative(longList));
    }
}
