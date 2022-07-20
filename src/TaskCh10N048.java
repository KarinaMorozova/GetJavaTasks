import java.util.Scanner;

/**
 * Написать рекурсивную функцию для вычисления максимального элемента
 * массива из n элементов.
 */

public class TaskCh10N048 {
    static int maxElem = Integer.MIN_VALUE;

    static int max(int[] numbers, int lastIndex){
        if (lastIndex >= 0) {
            if (maxElem < numbers[lastIndex]) {
                maxElem = numbers[lastIndex];
            }
            max(numbers, lastIndex - 1);
        }
        int result = maxElem;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array of numbers in one line");
        String str = scanner.nextLine();

        String[] n = str.split("\\s+");
        int[] numbers = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            numbers[i] = Integer.parseInt(n[i]);
        }

        System.out.println(max(numbers, numbers.length - 1));
    }
}
