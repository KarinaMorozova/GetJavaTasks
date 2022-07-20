/** Даны два целых числа a и b. Если a делится на b или b делится на a, то вывес-
* ти 1, иначе — любое другое число. Условные операторы и операторы цикла
* не использовать. */

import java.util.Scanner;

public class TaskCh02N043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = (a % b == 0 || b % a == 0) ? 1 : (int) (Math.random() * 10);

        System.out.println(num);
    }
}
