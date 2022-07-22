import java.util.*;

/**
 * Удалить из массива все повторяющиеся элементы, оставив их первые вхо-
 * ждения, т. е. в массиве должны остаться только различные элементы.
 */

public class TaskCh11N158 {
    public static void main(String[] args) {
        System.out.println("Please enter array of integer numbers in one line");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] literas = str.split(" ");

        int[] nums = new int[literas.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(literas[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                    nums[j] = 0;
                }
            }
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
