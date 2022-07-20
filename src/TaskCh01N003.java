import java.util.Scanner;

// Составить программу вывода на экран числа, вводимого с клавиатуры. Выво-
// димому числу должно предшествовать сообщение "Вы ввели число".

public class TaskCh01N003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Вы ввели число");
        System.out.println(num);
    }
}
