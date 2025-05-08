package Task3;
import java.util.List;

public class NumberListUtils {
    public static <T extends Number> int findFirstZeroIndex(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() == 0.0) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Number> int countNegatives(List<T> list) {
        int count = 0;
        for (T num : list) {
            if (num.doubleValue() < 0.0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number> T getLastNegative(List<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            T num = list.get(i);
            if (num.doubleValue() < 0.0) {
                return num;
            }
        }
        return null;
    }
}
