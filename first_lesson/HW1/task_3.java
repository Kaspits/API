package first_lesson.HW1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        // 3) Реализовать простой калькулятор (+-/*)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  числa");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите  операцию");
        String operation = sc.next();
        if (operation.equals("+")) {
            System.out.println(a + b);
        } else if (operation.equals("-")) {
            System.out.println(a + b);
        } else if (operation.equals("*")) {
            System.out.println(a * b);
        } else if (operation.equals("/")) {
            System.out.println(a / b);
        }
        sc.close();

    }
}
