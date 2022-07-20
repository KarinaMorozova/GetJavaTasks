import java.util.Scanner;

/**
 * Дано предложение. Поменять местами его первое и последнее слово.
 */

public class TaskCh09N166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(words[words.length - 1] + " ");

        for (int i = 1; i < words.length - 1; i++) {
            sb.append(words[i] + " ");
        }
        sb.append(words[0]);
        System.out.println(sb);
    }
}
