package Task2;

public class ArrayUtils {
    public static <T> void swapGroups(T[] array, int start1, int length1, int start2, int length2) {
        if (start1 + length1 > array.length || start2 + length2 > array.length || start1 < 0 || start2 < 0) {
            System.out.println("Invalid group bounds");
            return;
        }
        for (int i = 0; i < Math.min(length1, length2); i++) {
            T temp = array[start1 + i];
            array[start1 + i] = array[start2 + i];
            array[start2 + i] = temp;
        }
    }

    public static <T> void swapAdjacentPairs(T[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            T temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static <T> void replaceGroup(T[] array, int start, T[] replacement) {
        if (start < 0 || start + replacement.length > array.length) {
            System.out.println("Invalid replacement bounds");
            return;
        }
        System.arraycopy(replacement, 0, array, start, replacement.length);
    }
}
