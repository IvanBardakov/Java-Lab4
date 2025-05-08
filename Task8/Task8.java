package Task8;

public class Task8 {
    public static void main(String[] args) {
        BinaryTree continents = new BinaryTree();
        continents.addNode(1, "Європа");
        continents.addNode(3, "Африка");
        continents.addNode(5, "Австралія");
        continents.addNode(4, "Америка");
        continents.addNode(2, "Азія");
        continents.addNode(6, "Антарктида");

        System.out.println("Початкове дерево:");
        continents.traverseTree();

        System.out.println("\nВидаляємо континент з ключем 3:");
        continents.deleteNode(3);

        System.out.println("\nДерево після видалення:");
        continents.traverseTree();

        System.out.println("\nКонтинент з ключем 4:");
        System.out.println(continents.findNode(4));
    }
}
