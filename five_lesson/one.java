package five_lesson;

import java.util.HashMap;
import java.util.Map;

/*
 * Создать структуру для хранения паспортных номеров и фамилий сотрудников  организации
 * Вывести данные по сотрудникам с фамилией Иванов
 */
public class one {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();

        db.put(123456, "Иванов");
        db.put(234567, "Васильев");
        db.put(345678, "Петрова");
        db.put(456789, "Иванов");
        db.put(567891, "Петрова");
        db.put(678912, "Иванов");
        System.out.println(db);

        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("%d\n", item.getKey());
            }
        }
    }
}
