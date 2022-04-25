package com.ding.collection.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackTest {

    /**
     * 栈的操作：push(), pop(), peek()
     *
     */
    @Test
    public void test1(){
//        Stack<Integer> stack = new Stack<>(); // 一般不用 [1, 2, 3]
//        Deque<Integer> stack = new LinkedList<>(); // 规模大时性能更好
        Deque<Integer> stack = new ArrayDeque<>(); // 用这个

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); // [3, 2, 1]

        stack.pop();
        System.out.println(stack); // [2, 1]
        System.out.println(stack.peek()); // 2
    }

    /**
     * 队列的操作：add(), remove(), element() 抛异常
     *           offer(), poll(), peek()   不抛异常
     *
     */
    @Test
    public void test2(){
//        Deque<Integer> queue = new LinkedList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
