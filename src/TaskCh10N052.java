import java.util.Scanner;

/**
 * Написать рекурсивную процедуру для вывода на экран цифр натурального
 * числа в обратном порядке.
 */

public class TaskCh10N052 {
    static void reverse(long number) {
        System.out.print(number % 10);
        if (number >= 10) {
            reverse(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        reverse(n);
    }
}
