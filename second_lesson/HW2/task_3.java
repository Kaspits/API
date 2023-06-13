package second_lesson.HW2;
/*3) Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task_3 {
    public static void main(String[] args) {
        String pathFile = "task3_data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder result = new StringBuilder();
                // получаем отдельные поля в джсоне
                String[] parts = line.split(",");
                // перебираем все поля
                for (String part : parts) {
                    // получаем ключ и значение
                    String[] kv = part.split(":");
                    String key = kv[0];
                    String value = kv[1];
                    if (key.equals("\"surname\"")) {
                        result.append("Студент ").append(value.replaceAll("\"", "")).append(" ");
                    } else if (key.equals("\"mark\"")) {
                        result.append("получил ").append(value.replaceAll("\"", "")).append(" ");
                    } else if (key.equals("\"subject\"")) {
                        result.append("по предмету ").append(value.replaceAll("\"", "")).append(".");
                    }
                }
                System.out.println(result.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
