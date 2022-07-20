import java.util.Scanner;

public class TaskCh09N107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();

        if (word.indexOf("a") > 0 && word.lastIndexOf("o") > 0) {
            word = word.substring(0, word.indexOf("a")) + "o"
                    + word.substring(word.indexOf("a") + 1, word.lastIndexOf("o"))
                    + "a" + word.substring(word.lastIndexOf("o") + 1);
            System.out.println(word);
        } else {
            System.out.println("Sorry, there are no A and O letters at the same time!");
        }

    }
}
