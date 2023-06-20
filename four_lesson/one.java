package four_lesson;

import java.util.ArrayList;
import java.util.LinkedList;

public class one {
    /*
     * 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
     * 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
     * Сравните с предыдущим.
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            al.add(0);
        }
        long timeStop = System.currentTimeMillis();
        long res = timeStop - timeStart;
        System.out.println(res);

        LinkedList<Integer> ll = new LinkedList<>();
        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ll.add(0);
        }
        long timeStop2 = System.currentTimeMillis();
        long res2 = timeStop2 - timeStart2;
        System.out.println(res2);
    }
}
