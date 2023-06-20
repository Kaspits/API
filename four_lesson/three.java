package four_lesson;

import java.util.Scanner;
import java.util.Stack;

/*Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
qwe
tre
zxc
print
zxc tre qwe */
public class three {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String text;
        boolean isExit = false;
        sc.close();

        while (!isExit) {
            text = sc.nextLine();

            if (text.startsWith("print", 0)) {
                while (!st.empty()) {
                    System.out.print(st.pop() + " ");
                }
            } else if (text.equals("exit")) {
                isExit = true;
            } else {
                st.push(text);
            }
            System.out.println();
            System.out.println(st);
        }
    }
}
