package therd_lesson.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;

/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение */
public class task_one {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(30));
        }
        System.out.println("Original list: " + numbers);
        // Minimal
        int min = Collections.min(numbers);
        // Maximal
        int max = Collections.max(numbers);
        // Average
        double average = 0;
        if (numbers.size() > 0) {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            average = ((double) sum / numbers.size());
        }
        // Even numbers
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + average);
        System.out.println("Array: " + numbers);
    }
}
