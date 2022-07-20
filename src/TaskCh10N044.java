import java.util.Scanner;

/**
 * Написать рекурсивную функцию нахождения цифрового корня натурального
 * числа. Цифровой корень данного числа получается следующим образом. Ес-
 * ли сложить все цифры этого числа, затем все цифры найденной суммы
 * и повторять этот процесс, то в результате будет получено однозначное число
 * (цифра), которая и называется цифровым корнем данного числа.
 */

public class TaskCh10N044 {

    static int digitalRoot(int n) {
        if (n < 10) {
            return n;
        }

        int result = 0;
        if (n / 10 > 0) {
            result = result + n % 10 + digitalRoot(n / 10);
        }

        return digitalRoot(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();

        System.out.println("digital root = " + digitalRoot(n));
    }
}
