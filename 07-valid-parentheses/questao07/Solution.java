package questao07;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackSimbolos = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '[', '{':
                    stackSimbolos.push(c);
                    break;
                case ')':
                    if (!stackSimbolos.isEmpty()){
                        if (stackSimbolos.peek() != '(') return false;
                        else stackSimbolos.pop();
                    } else return false;
                    break;
                case ']':
                    if (!stackSimbolos.isEmpty()){
                        if (stackSimbolos.peek() != '[') return false;
                        else stackSimbolos.pop();
                    } else return false;
                    break;
                case '}':
                    if (!stackSimbolos.isEmpty()){
                        if (stackSimbolos.peek() != '{') return false;
                        else stackSimbolos.pop();
                    } else return false;
                    break;
            }
        }
        return stackSimbolos.isEmpty();
    }
}
