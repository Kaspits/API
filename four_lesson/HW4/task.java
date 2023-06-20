package four_lesson.HW4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
 * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

Даны два Deque, цифры в обратном порядке.
[3,2,1] - пример Deque
[5,4,3]- пример второго Deque
1) 123 * 345 = 42 435
Ответ всегда - связный список, в обычном порядке
[4,2,4,3,5] - пример ответа
 */
public class task {
    public static void main(String[] args) {
        Deque<String> deque_one = new ArrayDeque<>();
        deque_one.add("3");
        deque_one.add("2");
        deque_one.add("1");
        System.out.println("First number " + deque_one);

        Deque<String> deque_two = new ArrayDeque<>();
        deque_two.add("5");
        deque_two.add("4");
        deque_two.add("3");
        System.out.println("Second number " + deque_two);

        LinkedList<String> res1 = new LinkedList<>();
        fillLinkedList(res1, getInt(deque_one) * getInt(deque_two));
        System.out.println(res1);

        LinkedList<String> res2 = new LinkedList<>();
        fillLinkedList(res2, getInt(deque_one) + getInt(deque_two));
        System.out.println(res2);
    }

    public static int getInt(Deque<String> num) {
        Deque<String> temp = new ArrayDeque<>();
        for (String str : num) {
            temp.add(str);
        }

        String res = "";
        while (!temp.isEmpty()) {
            res += temp.pollLast();
        }
        return Integer.parseInt(res);
    }

    public static void fillLinkedList(LinkedList<String> ll, int number) {
        int num = number;
        if (num < 0) {
            num *= -1;
        }

        String temp = "";
        while (num != 0) {
            temp += num % 10;
            ll.addFirst(temp);
            num /= 10;
            temp = "";
        }

        if (number < 0) {
            ll.addFirst("-");
        }
    }

}

// deque.removeLast(); //возвращает с удалением элемент из начала очереди. Если
// очередь пуста, генерирует исключение NoSuchElementException
// deque.removeLast(); //возвращает с удалением элемент из конца очереди.
// deque.offerFirst(1); // добавляет элемент obj в самое начало очереди. Если
// элемент удачно добавлен,
// возвращает true, иначе - false
// deque.offerLast(2); // добавляет элемент obj в конец очереди.
// deque.pollFirst(); // возвращает с удалением элемент из начала очереди. Если
// очередь пуста, возвращает значение null
// deque.pollLast(); //возвращает с удалением последний элемент очереди.
// deque.getFirst(); // возвращает без удаления элемент из головы очереди. Если
// очередь пуста,
// генерирует исключение NoSuchElementException
// deque.getLast(); // возвращает без удаления последний элемент очереди. Если
// очередь пуста,
// генерирует исключение NoSuchElementException
// deque.peekFirst(); // возвращает без удаления элемент из начала очереди. Если
// очередь пуста,
// возвращает значение null
// deque.peekLast(); // возвращает без удаления последний элемент очереди.