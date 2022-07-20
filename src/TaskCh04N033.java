import java.util.Scanner;

/** Дано натуральное число.
* а) Верно ли, что оно заканчивается четной цифрой?
* б) Верно ли, что оно заканчивается нечетной цифрой?
*/

public class TaskCh04N033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = scanner.nextInt();
        if (number > 0) {
            String lastOne = String.valueOf(number);
            lastOne = lastOne.substring(lastOne.length() - 1);
            int result = Integer.parseInt(lastOne) % 2;
            if (result == 0) {
                System.out.println("Число заканчивается четной цифрой");
            } else {
                System.out.println("Число заканчивается нечетной цифрой");
            }
        }
    }
}
