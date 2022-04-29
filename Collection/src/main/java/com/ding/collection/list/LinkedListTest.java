package com.ding.collection.list;

import org.testng.annotations.Test;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void test01 () {
        LinkedList<Integer> list = new LinkedList<>();

        list.offer(111);
        list.offer(222);
        list.offer(333);

        System.out.println(list);
        System.out.println(list.poll());

        list.push(44);
        list.push(55);
        list.push(66);

        System.out.println(list);
        System.out.println(list.pop());
    }

    @Test
    public void test02(){
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
    }
    @Test
    public void test03(){
        Deque<Integer> stack = new LinkedList<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
    }
}
