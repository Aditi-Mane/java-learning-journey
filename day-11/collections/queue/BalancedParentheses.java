package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {
    public static void main(String[] args) {
        String brackets = "{[()]}";
        Deque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = true;

        for (char c : brackets.toCharArray()) {

            //if opening bracket found, push it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                //if stack is empty, mark false and break out
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                //check if corresponding closing bracket present, to pop it out
                if ((c == ')' && stack.peek() == '(') ||
                        (c == '}' && stack.peek() == '{') ||
                        (c == ']' && stack.peek() == '[')) {

                    stack.pop();

                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && stack.isEmpty()) {
            System.out.println("true: balanced parentheses");
        } else {
            System.out.println("false: not balanced parentheses");
        }
    }
}