package second_lesson.HW2;

public class task_1 {
    public static void main(String[] args) {
        /*
         * Дана строка sql-запроса "select * from students where ". Сформируйте часть
         * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
         * ниже в виде json-строки.
         * Если значение null, то параметр не должен попадать в запрос.
         * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
         * "city":"Moscow", "age":"null"}
         * Пример вывода:
         * "select * from students WHERE name = Ivanov AND country = Russia.....".
         */
        // String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\",
        // \"city\":\"Moscow\",\"age\":\"null\"}";
    }
}
