import java.util.Scanner;

/**
 * Написать рекурсивную функцию для вычисления k-го члена последователь-
 * ности Фибоначчи. Последовательность Фибоначчи f1, f2, ... образуется по
 * закону: f(1) = 1; f(2) = 1; fi = (fi-1) + f(i-2) ( i = 3, 4, ...).
 */

public class TaskCh10N047 {
    static int fibonacci(int k) {
        int result;

        switch (k) {
            case 0 : result = 0; break;
            case 1 : result = 1; break;
            default: result = fibonacci(k - 1) + fibonacci(k - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter K - number of term of Fibonacci sequence (k >= 0)");
        int k = scanner.nextInt();

        System.out.println(fibonacci(k));
    }

}
