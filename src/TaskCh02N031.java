/** В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
 * при этом двузначному числу справа приписали вторую цифру числа x, то по-
 * лучилось число n. По заданному n найти число x (значение n вводится с кла-
 * виатуры, 100 ≤ n ≤ 999).
 */

import java.util.Scanner;

public class TaskCh02N031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне [100, 999]");

        int num = scanner.nextInt();
        String str = String.valueOf(num);
        String newOne = str.substring(0, 1) + str.substring(2) + str.substring(1, 2);
        System.out.println("newOne = " + newOne);
    }
}
