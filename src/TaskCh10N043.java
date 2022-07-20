import java.util.Scanner;

/**
 * Написать рекурсивную функцию:
 * а) вычисления суммы цифр натурального числа;
 * б) вычисления количества цифр натурального числа.
 */

public class TaskCh10N043 {
    static int sum(int n) {
        int result = 0;

        if (n / 10 > 0) {
            result = result + n % 10 + sum(n / 10);
        } else {
            result = result + n;
        }

        return result;
    }

    static int digits(int n) {
        int result = 0;

        if (n / 10 > 0) {
            result = result + 1 + digits(n / 10);
        } else {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();

        System.out.println("sum = " + sum(n));
        System.out.println("number of digits = " + digits(n));
    }
}
