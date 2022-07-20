import java.util.Scanner;

/**
 * Написать рекурсивную функцию для вычисления факториала натурального
 * числа n.
 */

public class TaskCh10N041 {
    static int factorial(int n){
        int result = 1;
        if (n > 0) {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        System.out.println(factorial(num));
    }
}
