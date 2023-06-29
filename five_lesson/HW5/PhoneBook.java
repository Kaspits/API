package five_lesson.HW5;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Map;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут
 * повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами.
 * Вывод должен быть отсортирован по убыванию числа телефонов.
 * Пример ввода:
 * Иванов 234234
 * Иванов 32523
 * Иванов 5687
 * Иванов: 234234, 32523, 5687
 * Варианты Map:
 * Map<String, ArrayList>
 * Map<String, String>
 * Пример меню:
 * 1. Добавить контакт
 * 2. Вывести всех
 * 3. Выход
 * 
 * Принимаем значение с клавиатуры циклом до момента выхода
 * Создаем Мар
 * Сделать отсортированный вывод
 */

// public class PhoneBook {
// private static HashMap<String, ArrayList> contacts = new HashMap<>();

// public static void addContact(String name, String phoneNumber) {
// if (contacts.containsKey(name)) {
// ArrayList phoneNumbers = contacts.get(name);
// phoneNumbers.add(phoneNumber);
// contacts.put(name, phoneNumbers);
// } else {
// ArrayList phoneNumbers = new ArrayList<>();
// phoneNumbers.add(phoneNumber);
// contacts.put(name, phoneNumbers);
// }
// }

// public static void printContacts() {
// ArrayList<Map.Entry<String, ArrayList>> list = new
// ArrayList(contacts.entrySet());
// Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
// @Override
// public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String,
// ArrayList> o2) {
// return o2.getValue().size() - o1.getValue().size();
// }
// });

// for (Map.Entry<String, ArrayList> entry : list) {
// System.out.println(entry.getKey() + ": " + entry.getValue());
// }
// }

// public static void main(String[] args) {
// addContact("Ivanov", "12-45-4764");
// addContact("Petrov", "12-56-7123");
// addContact("Petrov", "33-56-9876");
// addContact("Sidorov", "12-56-6234");
// addContact("Ivanov", "65-43-7624");
// addContact("Ivanov", "12-56-376");

// printContacts();
// }
// }
