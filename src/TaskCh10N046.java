import java.util.Scanner;

/**
 * Даны первый член и знаменатель геометрической прогрессии. Написать ре-
 * курсивную функцию:
 * а) нахождения n-го члена прогрессии;
 * б) нахождения суммы n первых членов прогрессии.
 */

public class TaskCh10N046 {
    public static int sum;

    static int progression(int b, int q, int n){
        int result = 1;

        if (n > 0 && q > 0) {
            result = q * progression(b, q, n - 1);
        } else if (n == 0) {
            result = result * b;
        }
        sum = sum + result;

        return result;
    }

    public static void main(String[] args) {
        sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first term of progression");
        int b = scanner.nextInt();
        System.out.println("Please enter difference of progression");
        int q = scanner.nextInt();
        System.out.println("Please enter N - number of iterations");
        int n = scanner.nextInt();

        System.out.println("B(n) = " + progression(b, q, n - 1));
        System.out.println("Sum = " + sum);
    }
}
