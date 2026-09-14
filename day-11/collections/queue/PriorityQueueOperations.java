package queue;

import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 30, 20, 40};

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        //add all numbers to the queue
        for(int num: numbers){
            queue.offer(num);
        }

        //print smallest element without removing them
        System.out.println("Smallest: "+queue.peek());

        //remove elements one by one and print them
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
/* OUTPUT
Smallest: 10
10 20 30 40 50
 */
