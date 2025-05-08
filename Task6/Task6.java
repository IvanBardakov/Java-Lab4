package Task6;

public class Task6 {
    public static void main(String[] args) {
        CustomArray<Integer> array = new CustomArray<Integer>(-2, 2);

        array.set(-2, 10);
        array.set(-1, 20);
        array.set(0, 30);
        array.set(1, 40);
        array.set(2, 50);

        System.out.println("Elements in CustomArray (-2 to 2):");
        for (Integer value : array) {
            System.out.println(value);
        }

        System.out.println("Size: " + array.size());

        System.out.println("Element at index 0: " + array.get(0));

        System.out.println("Contains 30? " + array.contains(30));
        System.out.println("Contains 99? " + array.contains(99));

        try {
            array.get(3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}