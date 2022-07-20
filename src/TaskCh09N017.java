import java.util.Scanner;

/**
 * Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же
 * букву?
 */

public class TaskCh09N017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        System.out.println(word.charAt(0) == word.charAt(word.length() - 1));
    }
}
