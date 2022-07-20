import java.util.Scanner;

/**
 * Дано целое число k (1 k 365). Определить, каким будет k-й день года: вы-
 * ходным (суббота и воскресенье) или рабочим, если 1 января — понедельник.
 */

public class TaskCh04N067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня года");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 365) {
            int result = num % 7;
            if (result == 0 || result == 6) {
                System.out.println("Это выходной день");
            } else {
                System.out.println("Это рабочий день");
            }
        }
    }
}
