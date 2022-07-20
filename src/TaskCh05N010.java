import java.util.Scanner;

/**
 * Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему
 * курсу (значение курса вводится с клавиатуры).
 */

public class TaskCh05N010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю");
        int exchange = scanner.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            System.out.println(i * exchange);
        }
    }
}
