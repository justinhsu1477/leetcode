package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parenthesis {
    public  boolean valid(String str) {
        if (str.isBlank()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.pop()!=map.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return  stack.isEmpty();
    }
}
