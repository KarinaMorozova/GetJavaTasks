import java.util.Scanner;

/** Работа светофора для пешеходов запрограммирована следующим образом: в
 *  начале каждого часа в течение трех минут горит зеленый сигнал, затем в те-
 *  чение двух минут — красный, в течение трех минут — опять зеленый и т. д.
 *  Дано вещественное число t, означающее время в минутах, прошедшее с нача-
 *  ла очередного часа. Определить, сигнал какого цвета горит для пешеходов в
 *  этот момент.
 */

public class TaskCh04N036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в минутах, прошедших с начала часа");
        double min = scanner.nextDouble();
        if (min < 60) {
            int result = (int) min % 5;
            if (result == 0 || result < 3) {
                System.out.println("Горит зеленый");
            } else {
                System.out.println("Горит красный");
            }
        }
    }
}
