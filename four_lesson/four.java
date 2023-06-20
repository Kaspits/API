package four_lesson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/*
 * Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 */
public class four {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rd = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt(10);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(fillStack(nums));
        System.out.println(fillQueue(nums));

    }

    public static Stack<Integer> fillStack(int[] i) {
        Stack<Integer> st = new Stack<>();
        for (int num : i) {
            st.push(num);
        }
        return st;
    }

    public static Queue<Integer> fillQueue(int[] i) {
        Queue<Integer> qu = new LinkedList<>();
        for (int num : i) {
            qu.add(num);
        }
        return qu;
    }
}
