package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack before: "+stack);

        System.out.println("Peek: "+stack.peek());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Peek: "+stack.peek());

        System.out.println("Stack after: "+stack);
    }
}
/* OUTPUT
Stack before: [30, 20, 10]
Peek: 30
Pop: 30
Peek: 20
Stack after: [20, 10]
*/
