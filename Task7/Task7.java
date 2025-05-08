package Task7;

public class Task7 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        System.out.println("Test 1: Adding elements");
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        System.out.println("List after adding: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("\nTest 2: Adding at index");
        list.add(2, 10);
        System.out.println("List after adding 10 at index 2: " + list);
        System.out.println("\nTest 3: Getting elements");
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("\nTest 4: Updating elements");
        list.set(1, 100);
        System.out.println("List after updating element at index 1: " + list);
        System.out.println("\nTest 5: Removing elements");
        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("List after removing first element: " + list);
        System.out.println("Removed last element: " + list.removeLast());
        System.out.println("List after removing last element: " + list);
        System.out.println("Removed element at index 1: " + list.remove(1));
        System.out.println("List after removing element at index 1: " + list);
        System.out.println("\nTest 6: Checking empty list");
        while (!list.isEmpty()) {
            list.removeFirst();
        }
        System.out.println("List after removing all elements: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
