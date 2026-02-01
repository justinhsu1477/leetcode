package leetcode;

import java.util.*;

public class ValidParentheses {
    public boolean valid(String s) {
        if (s.isBlank()||s.length()%2!=0){
            return  false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
