import java.util.Scanner;

/**
 * Дано слово, состоящее из четного числа букв. Вывести на экран его первую
 * половину, не используя оператор цикла.
 */

public class TaskCh09N022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        if (word.length() % 2 == 0) {
            System.out.println(word.substring(0, word.length() / 2));
        } else {
            System.out.println("Sorry, length of this word is not even!");
        }

    }
}
