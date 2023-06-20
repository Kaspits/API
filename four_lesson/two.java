package four_lesson;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида
    text
    1. Нужно сохранить text в связный список.
    2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка
 */
public class two {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String text;
        boolean isExit = false;
        sc.close();

        while (!isExit) {
            text = sc.nextLine();

            if (text.startsWith("print~", 0)) {
                System.out.println(link.remove(Integer.parseInt(text.substring(6))));
            } else if (text.equals("exit")) {
                isExit = true;
            } else {
                link.add(text);
            }
            System.out.println(link);
        }
    }
}
