import java.util.Scanner;

/**
 * Дано слово. Вывести на экран его k-й символ.
 */

public class TaskCh09N015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        System.out.println("Enter an index of this word which letter is needed to be printed");
        int index = scanner.nextInt();
        if (index <= word.length()) {
            System.out.println(word.substring(index - 1, index));
        } else {
            System.out.println("Sorry, your index is a bit incorrect!");
        }
    }
}
