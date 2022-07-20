import java.util.Scanner;

/**
 * В некоторых языках программирования (например, в Паскале) не преду-
 * смотрена операция возведения в степень. Написать рекурсивную функцию
 * для расчета степени n вещественного числа a (n — натуральное число).
 */

public class TaskCh10N042 {
    static double power(double a, int n) {
        double result = a;
        if (n > 1) {
            result = result * power(a, n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        double a = scanner.nextInt();
        System.out.println("Please enter a power of number (> 0)");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(power(a, n));
        }
    }
}
