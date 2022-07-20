import java.util.Scanner;

/**
 * Составить программу, которая в зависимости от порядкового номера ме-
 * сяца (1, 2, ..., 12) выводит на экран время года, к которому относится этот
 * месяц.
 */

public class TaskCh04N106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца");
        int num = scanner.nextInt();
        switch (num) {
            case 1, 2, 12:
                System.out.println("Это зима");
                break;
            case 3, 4, 5:
                System.out.println("Это весна");
                break;
            case 6, 7, 8:
                System.out.println("Это лето");
                break;
            case 9, 10, 11:
                System.out.println("Это осень");
                break;
        }
    }
}
