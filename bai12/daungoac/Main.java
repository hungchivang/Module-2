package bai12.daungoac;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String list = "[[()()]()";

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < list.length(); i++) {
            if (list.charAt(i) == '(') {
                stack.push('(');
            } else if (list.charAt(i) == '[') {
                stack.push('[');
            } else if (list.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            } else if (list.charAt(i) == ']') {
                if (stack.size() > 0 && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(']');
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
