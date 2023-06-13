package second_lesson;

import java.io.FileWriter;

public class three {
    // Записать в файл 10 раз слово тест
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";
        try {
            FileWriter file = new FileWriter("test.txt", true); // Тру или фолс позволяет или не позволяет дописывать
                                                                // что-то в файл
            for (int i = 0; i < n; i++) {
                file.write(text);
                file.write("\n");
            }
            file.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
