import java.util.Scanner;

/**
 * Составить программу, которая печатает заданное слово, начиная с последней
 * буквы.
 */

public class TaskCh09N042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        System.out.println(sb.reverse());
    }
}
