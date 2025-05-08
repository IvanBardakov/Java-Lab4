package Task7;

import java.util.*;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T element) {
        addLast(element);
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            System.out.println("Error: Index out of bounds (" + index + ")");
            return;
        }
        if (index == size) {
            addLast(element);
        } else {
            Node<T> node = getNode(index);
            if (node != null) {
                addBefore(node, element);
            }
        }
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element, null, head);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
        modCount++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element, tail, null);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
        modCount++;
    }

    private void addBefore(Node<T> node, T element) {
        Node<T> prev = node.prev;
        Node<T> newNode = new Node<>(element, prev, node);
        node.prev = newNode;
        if (prev != null) {
            prev.next = newNode;
        } else {
            head = newNode;
        }
        size++;
        modCount++;
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error: Index out of bounds (" + index + ")");
            return null;
        }
        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        return node != null ? node.data : null;
    }

    @Override
    public T set(int index, T element) {
        Node<T> node = getNode(index);
        if (node == null) return null;
        T oldValue = node.data;
        node.data = element;
        return oldValue;
    }

    @Override
    public T remove(int index) {
        Node<T> node = getNode(index);
        if (node == null) return null;
        T oldValue = node.data;
        unlink(node);
        return oldValue;
    }

    private void unlink(Node<T> node) {
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }
        if (next != null) {
            next.prev = prev;
        } else {
            tail = prev;
        }
        size--;
        modCount++;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<>() {
            private Node<T> current = (index == size) ? null : getNode(index);
            private Node<T> lastReturned = null;
            private int nextIndex = index;
            private int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public T next() {
                checkForComodification();
                if (!hasNext()) {
                    System.out.println("Error: No next element");
                    return null;
                }
                lastReturned = current;
                T element = current.data;
                current = current.next;
                nextIndex++;
                return element;
            }

            @Override
            public boolean hasPrevious() {
                return nextIndex > 0;
            }

            @Override
            public T previous() {
                checkForComodification();
                if (!hasPrevious()) {
                    System.out.println("Error: No previous element");
                    return null;
                }
                current = (current == null) ? tail : current.prev;
                lastReturned = current;
                nextIndex--;
                return current.data;
            }

            @Override
            public int nextIndex() {
                return nextIndex;
            }

            @Override
            public int previousIndex() {
                return nextIndex - 1;
            }

            @Override
            public void remove() {
                checkForComodification();
                if (lastReturned == null) {
                    System.out.println("Error: Illegal state for remove()");
                    return;
                }
                unlink(lastReturned);
                if (current == lastReturned) {
                    current = lastReturned.next;
                } else {
                    nextIndex--;
                }
                lastReturned = null;
                expectedModCount++;
            }

            @Override
            public void set(T e) {
                checkForComodification();
                if (lastReturned == null) {
                    System.out.println("Error: Illegal state for set()");
                    return;
                }
                lastReturned.data = e;
            }

            @Override
            public void add(T e) {
                checkForComodification();
                if (current == null) {
                    addLast(e);
                } else {
                    addBefore(current, e);
                }
                nextIndex++;
                lastReturned = null;
                expectedModCount++;
            }

            private void checkForComodification() {
                if (modCount != expectedModCount) {
                    System.out.println("Error: Concurrent modification detected");
                }
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
