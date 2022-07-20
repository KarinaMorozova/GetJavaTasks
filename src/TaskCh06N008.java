import java.util.Scanner;

/**
 * Дано число n. Из чисел 1, 4, 9, 16, 25, ... напечатать те, которые не превыша-
 * ют n.
 */

public class TaskCh06N008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        int i = 1;
        int mult = 1;
        do {
            System.out.println(mult);
            i++;
        } while ((mult = i * i) <= n);
    }
}
