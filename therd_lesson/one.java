package therd_lesson;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        /*
         * 4. *Дополнительно. Задано уравнение вида x + y = z. Где, (x, y, z) >= 0.
         * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
         * Требуется восстановить выражение до верного равенства.
         * Предложить хотя бы одно решение или сообщить, что его нет.
         * Вывод: 24 + 45 = 69
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter equation like '?? + ?? = 69': ");
        String equation = iScanner.nextLine();
        String message = "Решения нет!";
        boolean flag = true;
        for (int i = 0; (i < 10) && flag; i++) {
            String result = equation.replace("?", Integer.toString(i));
            System.out.println(result);
            // 2итер: result = 24 + 45 = 69
            String[] arr = result.split(" ");
            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                message = result;
                flag = false;
            }
        }
        System.out.println(message);
        iScanner.close();
    }
}
