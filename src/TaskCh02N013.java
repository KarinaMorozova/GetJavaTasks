import java.util.Scanner;

// Дано трехзначное число. Найти число, полученное при прочтении его цифр
// справа налево.

public class TaskCh02N013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 100 до 200, не включая интервалы");
        int number = scanner.nextInt();
        if (number > 100 && number < 200) {
          StringBuilder sb = new StringBuilder();
          sb.append(number);
          number = Integer.parseInt(sb.reverse().toString());
            System.out.println("Число справа налево = " + number);
        }
        else {
            System.out.println("Вы ввели число не в заданном интервале");
        }
    }
}
