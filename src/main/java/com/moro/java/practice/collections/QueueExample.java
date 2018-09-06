package com.moro.java.practice.collections;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        linkedListQueueDemo();

        System.out.println();

        priorityQueueDemo();

        evenBeforeOddASC();
    }

    private static void linkedListQueueDemo() {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 5; i >= 1; i--) {
            queue.add(i);
        }

        /*
        Out: 5 4 3 2 1
         */
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    private static void priorityQueueDemo() {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 10; i >= 1; i--) {
            queue.add(i);
        }

        /*
        Out: 1 2 3 4 5 6 7 8 9 10
         */
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    private static void evenBeforeOddASC() {
        System.out.println();

        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if ((o1 % 2 == 0 && o2 % 2 == 0) ||
                    (o1 % 2 != 0 && o2 % 2 != 0)) {
                return Integer.compare(o1, o2);
            } else if (o1 % 2 == 0 && o2 % 2 != 0) {
                return -1;
            } else return 1;
        });

        for(int i = 1; i <= 10; i++){
            queue.add(i);
        }

        /*
        Out: 2 4 6 8 10 1 3 5 7 9
         */
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
