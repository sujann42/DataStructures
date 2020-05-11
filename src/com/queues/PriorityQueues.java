package com.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<String> pq_string = new PriorityQueue<>();
        queue.add(11);
        queue.add(2);
        queue.add(13);
        queue.add(44);
        queue.add(5);
        System.out.println(queue);
        queue.offer(150);
        queue.offer(100);
        queue.offer(120);
        System.out.println(queue);
        pq_string.add("Mango");
        pq_string.add("Apple");
        pq_string.add("Orange");
        pq_string.add("Banana");

        System.out.println(queue);
        System.out.println(pq_string);
        //pq_string.clear();
        System.out.println(pq_string.peek());
        System.out.println(pq_string);
        Iterator itr = pq_string.iterator();
        System.out.println("Iterator values are: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
