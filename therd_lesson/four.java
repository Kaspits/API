package therd_lesson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class four {
  public static void main(String[] args) {
    // Заполнить список десятью случайными числами. Отсортировать список методом
    // sort() и вывести его на экран.
    ArrayList<Integer> ints = new ArrayList<>();
    Random rnd = new Random();

    for (int i = 0; i < 10; i++) {
      ints.add(rnd.nextInt(1000));
    }
    ints.sort(Comparator.reverseOrder());
    System.out.println(ints);
  }
}
