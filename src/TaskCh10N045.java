import java.util.Scanner;

/**
 * Даны первый член и разность арифметической прогрессии. Написать рекур-
 * сивную функцию для нахождения:
 * а) n-го члена прогрессии;
 * б) суммы n первых членов прогрессии.
 *
 * a n = a 1 + d ( n − 1 ) , где n — порядковый номер члена прогрессии,
 * a 1 — первый член прогрессии, d — разность. Это равенство называется
 * общей формулой арифметической прогрессии.
 */

public class TaskCh10N045 {
    public static int sum;

    static int progression(int a, int d, int n){
        int result = 0;

        if (n > 0) {
            result = d + progression(a, d, n - 1);
        } else if (n == 0) {
            result = result + a;
        }
        sum = sum + result;

        return result;
    }

    public static void main(String[] args) {
        sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first term of progression");
        int a = scanner.nextInt();
        System.out.println("Please enter difference of progression");
        int d = scanner.nextInt();
        System.out.println("Please enter N - number of iterations");
        int n = scanner.nextInt();

        System.out.println("A(n) = " + progression(a, d, n - 1));
        System.out.println("Sum = " + sum);
    }
}
