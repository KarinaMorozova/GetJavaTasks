import java.util.Scanner;

// Записать по правилам изучаемого языка программирования следующие выражения

public class TaskCh01N017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = scanner.nextInt();
        System.out.println("Введите через Enter коэффициенты a, b, c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double o = Math.sqrt(1 - Math.sin(x) * Math.sin(x));
        double p = 1./Math.sqrt(a * x * x + b * x + c);
        double r = (Math.sqrt(x + 1) + Math.sqrt(x - 1))/2 * Math.sqrt(x);
        double s = Math.abs(x) + Math.abs(x + 1);

        System.out.println("Math.sqrt(1 - Math.sin(x) * Math.sin(x)) = " + o);
        System.out.println("1./Math.sqrt(a * x * x + b * x + c) = " + p);
        System.out.println("(Math.sqrt(x + 1) + Math.sqrt(x - 1))/2 * Math.sqrt(x) = " + r);
        System.out.println("Math.abs(x) + Math.abs(x + 1) = " + s);
    }
}
