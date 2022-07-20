/** Даны целые числа h, m, s (0 < h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), указывающие
* момент времени: "h часов, m минут, s секунд". Определить угол (в градусах)
* между положением часовой стрелки в начале суток и в указанный момент
* времени.
*/

import java.util.Scanner;

public class TaskCh02N039 {
    public static void main(String[] args) {
        final double degrees = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число часов, минут и секунд");
        int hours = scanner.nextInt();
        hours = hours > 12 ? hours - 12 : hours;
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        double result = hours * degrees + minutes * degrees / 60 + seconds * degrees / 3600;
        System.out.println("Угол между стрелкой на 00 00 и текущим положением " + result + " градусов");
    }
}
