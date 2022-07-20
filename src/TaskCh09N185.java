import java.util.Scanner;

/**
 * Строка содержит арифметическое выражение, в котором используются
 * круглые скобки, в том числе вложенные. Проверить, правильно ли в нем рас-
 * ставлены скобки.
 * а) Ответом должны служить слова да или нет.
 * б) В случае неправильности расстановки скобок:
 * если имеются лишние правые (закрывающие) скобки, то выдать сооб-
 * щение с указанием позиции первой такой скобки;
 * если имеются лишние левые (открывающие) скобки, то выдать сообще-
 * ние с указанием количества таких скобок.
 * Если скобки расставлены правильно, то сообщить об этом.
 */

public class TaskCh09N185 {
    public static void main(String[] args) {
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите математическое выражение");
        String expression = scanner.nextLine();

        // Если закрывающая скобка встретилась раньше всех открывающих
        if (expression.indexOf(")") < expression.indexOf("(")) {
            String withParenthesis = expression.substring(0, expression.indexOf("("));
            String withoutParenthesis = withParenthesis.replaceAll("[)]", "");
            System.out.println("Число лишних закрывающих скобок перед открывающими = "
                    + (withParenthesis.length() - withoutParenthesis.length()));
            isCorrect = false;
        }

        // Если открывающая скобка встретилась позже всех закрывающих
        if (expression.lastIndexOf("(") > expression.lastIndexOf(")")) {
            String withParenthesis = expression.substring(expression.lastIndexOf(")") + 1);
            int index = expression.substring(0, expression.lastIndexOf(")")).length() + 1 + withParenthesis.indexOf("(");
            System.out.println("Первая позиция лишней открывающей скобки после закрывающей = " + index);
            isCorrect = false;
        }

        // закрывающие
        String woRight = expression.replaceAll("[)]", "");
        // открывающие
        String woLeft = expression.replaceAll("[(]", "");
        if (woRight == woLeft) {
            System.out.println("Да,скобки расставлены правильно");
        } else if (woRight.length() < woLeft.length()) {
            // Если число закрывающих скобок больше числа открывающих
            isCorrect = false;
            System.out.println("Есть лишние закрывающие скобки");
            int diff = woLeft.length() - woRight.length();
            String temp = expression;
            int index = 0;
            for (int i = 0; i < diff; i++) {
                index = temp.lastIndexOf(")");
                temp = temp.substring(0, temp.lastIndexOf(")"));
            }
            System.out.println("Первая позиция лишней закрывающей скобки справа = " + index);
        } else if (woRight.length() > woLeft.length()) {
            // Если число открывающих скобок больше числа закрывающих
            isCorrect = false;
            System.out.println("Есть лишние открывающие скобки");
            int ness = woRight.length() - woLeft.length();
            System.out.println("Число лишних открывающих скобок слева = " + ness);
        }

        if (!isCorrect) {
            System.out.println("Нет, скобки расставлены неправильно");
        }
    }
}
