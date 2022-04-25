package com.ding.collection.queue;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PriorityQueueTest {
    @Test
    public void test1() {
//        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(1);
        queue.offer(2);
        queue.offer(5);
        queue.add(23);
        queue.addAll(Arrays.asList(31, 45, 56, 32, 45));

        while (queue.peek() != null) {
            System.out.print(queue.poll() + "\t");
        }
    }

    @Test
    public void test() {
//        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
//        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
    }
}
