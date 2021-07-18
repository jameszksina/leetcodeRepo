package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class $20ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        char[] str = s.toCharArray();
        boolean valid = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (!charMap.containsKey(str[i])) {
                stack.push(str[i]);
            } else {
                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }
                Character lastChar = stack.pop();
                if (lastChar != charMap.get(str[i])) {
                    valid = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            valid = false;
        }
        return valid;
    }
}
