package Task5;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();

        users.put("Alice", "pass123");
        users.put("Bob", "securepassword789");
        users.put("Charlie", "mypassword");
        users.put("Dave", "123");

        System.out.println("Users with passwords longer than 6 characters:");
        boolean found = false;
        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getValue().length() > 6) {
                System.out.printf("Username: %s, Password: %s%n", entry.getKey(), entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No users with passwords longer than 6 characters found.");
        }
    }
}
