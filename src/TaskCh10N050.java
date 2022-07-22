import java.util.Scanner;

/**
 * Написать рекурсивную функцию для вычисления значения так называемой
 * функции Аккермана для неотрицательных чисел n и m.
 * Функцию Аккермана называют дважды рекурсивной, т. к. сама функция и
 * один из ее аргументов определены через самих себя.
 * Найти значение функции Аккермана для n 1, m 3.
 */

public class TaskCh10N050 {
    static int A(int n, int m) {
        if ( n == 0)
            return m + 1;
        else
        if ((n != 0) && (m == 0))
            return A(n - 1,1);
        else
            return A(n - 1, A(n,m - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение N");
        int n = scanner.nextInt();
        System.out.println("Введите значение M");
        int m = scanner.nextInt();

        System.out.println("Функция Аккермана A(" + n + ", "+ m + ") = " + A(n, m));
    }
}
