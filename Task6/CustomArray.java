package Task6;
import java.util.*;

public class CustomArray<T> extends AbstractList<T> implements Collection<T> {
    private final T[] array;
    private final int from;
    private final int to;

    @SuppressWarnings("unchecked")
    public CustomArray(int from, int to) {
        if (from > to) {
            System.out.println("Error: 'from' must be less than or equal to 'to'");
            this.from = 0;
            this.to = -1;
            this.array = (T[]) new Object[0];
            return;
        }
        this.from = from;
        this.to = to;
        int size = to - from + 1;
        this.array = (T[]) new Object[size];
    }

    private int toInternalIndex(int index) {
        if (index < from || index > to) {
            System.out.println("Error: Index " + index + " out of bounds [" + from + ", " + to + "]");
            return -1;
        }
        return index - from;
    }

    @Override
    public T get(int index) {
        int internalIndex = toInternalIndex(index);
        if (internalIndex == -1) return null;
        return array[internalIndex];
    }

    @Override
    public T set(int index, T element) {
        int internalIndex = toInternalIndex(index);
        if (internalIndex == -1) return null;
        T oldValue = array[internalIndex];
        array[internalIndex] = element;
        return oldValue;
    }

    @Override
    public int size() {
        return to - from + 1;
    }

    @Override
    public boolean add(T e) {
        System.out.println("Error: Cannot add elements to a fixed-size CustomArray");
        return false;
    }

    @Override
    public void add(int index, T element) {
        int internalIndex = toInternalIndex(index);
        if (internalIndex == -1) return;
        set(index, element);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current = from;

            @Override
            public boolean hasNext() {
                return current <= to;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    System.out.println("Error: No more elements in iterator");
                    return null;
                }
                return get(current++);
            }
        };
    }

    @Override
    public boolean contains(Object o) {
        for (T element : this) {
            if (Objects.equals(o, element)) {
                return true;
            }
        }
        return false;
    }
}
