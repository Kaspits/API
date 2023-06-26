package five_lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* Написать программу, которая определяет правильность расстановки скобок в выражении
 * Примеры:
 * a+(d*3) - true
 * [a+(1*3) - false
 */
public class three {
    public static boolean checkSkobki(String word) {
        Map<Character, Character> dict = new HashMap<>();
        dict.put(')', '(');
        dict.put('}', '{');
        dict.put(']', '[');
        dict.put('>', '<');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {

            if (dict.containsValue(word.charAt(i))) {
                stack.push(word.charAt(i));
            } else if (dict.containsKey(word.charAt(i))) {
                if (stack.isEmpty() || stack.pop() != dict.get(word.charAt(i)))
                    return false;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println(checkSkobki("a+(d*3"));
    }
}
