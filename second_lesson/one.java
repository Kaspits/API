package second_lesson;

import java.util.Scanner;

/**
 * one
 */
public class one {
    // Дано четное число N(>0) и символы с1 и с2.
    // Написать метод, который вернет строку длины N,
    // Строка должна состоять из символов с1 и с2, начиная с с1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четное положительное число: ");
        int n = sc.nextInt();
        System.out.println("Введите первый символ");
        char c1 = sc.next().charAt(0);
        System.out.println("Введите второй символ");
        char c2 = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        // String sb = "";

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
            // sb += c1;
            // sb += c2;

        }
        sc.close();
        System.out.println(sb);
    }
}