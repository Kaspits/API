package five_lesson;
/* Даны две строки. Написать метод, который вернет тру, если эти строки являются изоморфными и фолс, если нет.
 * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую буккву во втором слове,
 * при этом 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования
 * (например, add - egg изоморфны)
 * 2. буква может не меняться, а оставаться такой же( Наример note - code)
 */

import java.util.HashMap;
import java.util.Map;

public class two {
    public static boolean checkIsMorf(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        Map<Character, Character> db = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (db.containsKey(word1.charAt(i))) {
                if (word2.charAt(i) != db.get(word1.charAt(i))) {
                    System.out.println(db);
                    return false;
                }
            } else {
                db.put(word1.charAt(i), word2.charAt(i));
            }
        }
        System.out.println(db);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIsMorf("add", "egg"));
        System.out.println(checkIsMorf("note", "code"));
        System.out.println(checkIsMorf("foo", "bar"));
        System.out.println(checkIsMorf("paper", "title"));

    }
}
