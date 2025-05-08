package Task4;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        SortedSet<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                uniqueWords.add(cleanedWord);
            }
        }

        System.out.println(uniqueWords);

        scanner.close();
    }
}
