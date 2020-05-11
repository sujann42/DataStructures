package com.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueofBooks {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        System.out.print(queue);
        System.out.print("\n"+queue.peek());
        queue.poll();
        System.out.println("\n"+queue);
        System.out.println(queue.toArray()[1]);
    }
}
