package org.example.HW4.Task2;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        String text = "(Проверка {текст} [ура])";
        System.out.println(Valid(text));
    }

    public static boolean Valid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
