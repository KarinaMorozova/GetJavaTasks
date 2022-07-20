import java.time.LocalDate;
import java.util.Scanner;

/**
 * Известны год и номер месяца рождения человека, а также год и номер месяца
 * сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
 * полных лет). В случае совпадения указанных номеров месяцев считать, что
 * прошел полный год.
 */
public class TaskCh04N015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц и год рождения через Enter");

        int month = scanner.nextInt();
        int year = scanner.nextInt();
        // LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2014, 12, 1);

        year = today.getYear() - year;

        month = today.getMonthValue() - month;

        year = (month < 0) ? year - 1 : year;

        System.out.println(year);
    }
}
