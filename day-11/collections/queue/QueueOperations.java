package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> customers = new ArrayDeque<>();

        //add four customers
        customers.offer("Aditi");
        customers.offer("Rahul");
        customers.offer("Sneha");
        customers.offer("Vishal");

        //display queue
        System.out.println(customers);

        //view who is next without removing them
        System.out.println("Peeked: "+customers.peek());

        //remove the first customer
        System.out.println("Served: " + customers.poll());
        System.out.println(customers);

        //check whether queue is empty
        if(customers.isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
/* OUTPUT
[Aditi, Rahul, Sneha, Vishal]
Peeked: Aditi
Served: Aditi
[Rahul, Sneha, Vishal]
Queue is not empty
 */

//offer() → add to the rear
//peek()  → look at the front (returns null if empty)
//poll()  → remove from the front (returns null if empty