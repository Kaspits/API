package second_lesson;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // Напишите метод, который сжимает строку aaaabbbcdd
        // Ввод аааbbbcdd Вывод a4b3cd2
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getShorty(str);
    }

    public static void getShorty(String str) {
        str = str.concat("/");
        int counter = 1;
        char temp = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                counter++;
            } else {
                if (counter == 1) {
                    System.out.printf("%c", temp);
                } else {
                    System.out.printf("%c%d", temp, counter);
                }
                temp = str.charAt(i);
                counter = 1;
            }
        }
    }
}
