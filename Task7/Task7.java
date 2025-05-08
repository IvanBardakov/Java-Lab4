package Task7;



public class Task7 {
    public static void main(String[] args) {
        System.out.println("Testing Integer DoublyLinkedList:");
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();
        intList.addFirst(3);
        intList.addFirst(2);
        intList.addLast(4);
        intList.add(1, 1);
        System.out.println("List: " + intList);
        System.out.println("Size: " + intList.size());
        System.out.println("Get index 2: " + intList.get(2));
        intList.remove(1);
        System.out.println("After removing index 1: " + intList);
        System.out.println();

        System.out.println("Testing String DoublyLinkedList:");
        DoublyLinkedList<String> stringList = new DoublyLinkedList<String>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("List: " + stringList);
        System.out.println("Size: " + stringList.size());
        stringList.set(1, "Blueberry");
        System.out.println("After setting index 1 to Blueberry: " + stringList);
        System.out.println();

        System.out.println("Testing Double DoublyLinkedList:");
        DoublyLinkedList<Double> doubleList = new DoublyLinkedList<Double>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.println("List: " + doubleList);
        System.out.println("Contains 2.2? " + doubleList.contains(2.2));
        doubleList.remove(0);
        System.out.println("After removing index 0: " + doubleList);
    }
}
