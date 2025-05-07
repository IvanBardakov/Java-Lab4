package Task2;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));

        ArrayUtils.swapGroups(intArray, 0, 3, 4, 3);
        System.out.println("After swapping groups (1-3 with 5-7): " + Arrays.toString(intArray));

        ArrayUtils.swapAdjacentPairs(intArray);
        System.out.println("After swapping adjacent pairs: " + Arrays.toString(intArray));

        Integer[] intReplacement = {9, 10, 11};
        ArrayUtils.replaceGroup(intArray, 2, intReplacement);
        System.out.println("After replacing group at index 2: " + Arrays.toString(intArray));

        System.out.println("\n---\n");

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println("Original Double array: " + Arrays.toString(doubleArray));

        ArrayUtils.swapGroups(doubleArray, 0, 2, 4, 2);
        System.out.println("After swapping groups (0-1 with 4-5): " + Arrays.toString(doubleArray));

        ArrayUtils.swapAdjacentPairs(doubleArray);
        System.out.println("After swapping adjacent pairs: " + Arrays.toString(doubleArray));

        Double[] doubleReplacement = {7.7, 8.8};
        ArrayUtils.replaceGroup(doubleArray, 1, doubleReplacement);
        System.out.println("After replacing group at index 1: " + Arrays.toString(doubleArray));

        System.out.println("\n---\n");

        String[] stringArray = {"A", "B", "C", "D", "E", "F"};
        System.out.println("Original String array: " + Arrays.toString(stringArray));

        ArrayUtils.swapGroups(stringArray, 1, 2, 3, 2);
        System.out.println("After swapping groups (1-2 with 3-4): " + Arrays.toString(stringArray));

        ArrayUtils.swapAdjacentPairs(stringArray);
        System.out.println("After swapping adjacent pairs: " + Arrays.toString(stringArray));

        String[] stringReplacement = {"X", "Y"};
        ArrayUtils.replaceGroup(stringArray, 2, stringReplacement);
        System.out.println("After replacing group at index 2: " + Arrays.toString(stringArray));
    }
}
