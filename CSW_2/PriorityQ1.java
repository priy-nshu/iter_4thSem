package CSW_2;

import java.util.*;
import java.io.*;

public class PriorityQ1 {
    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Hello");
        pq.add("How");
        pq.add("Have");
        pq.add("You");
        pq.add("Been");


        System.out.println("Initial PriorityQueue " + pq);

        pq.remove("Have");
        System.out.println("After Remove - " + pq);

        System.out.println("After Poll Method - " + pq.poll());
        System.out.println("Peek Method - " + pq.peek());
        System.out.println("Final PriorityQueue - " + pq);

        pq.add("0");
        System.out.println("Priority queue: " + pq);

        pq.peek();
        System.out.println("Peek: " + pq.peek());

        pq.poll();
        System.out.println("Priority queue after removing top element: " + pq);

        System.out.println("Does the queue contain 37 " + pq.contains(37));

        System.out.println("Size of queue: " + pq.size());

        pq.clear();
        System.out.println("Is the queue empty? " + pq.isEmpty());

    }
}
