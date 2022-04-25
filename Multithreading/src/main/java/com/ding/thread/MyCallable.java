package com.ding.thread;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable<T> implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                result += i;
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
        return result;
    }

    @Test
    public void myCallable() throws ExecutionException, InterruptedException {
        Callable<Integer> myRunnable = new MyCallable<>();
        FutureTask<Integer> futureTask = new FutureTask<>(myRunnable);
        Thread thread = new Thread(futureTask);
        thread.setName("myCallable");
        thread.start();

        Integer result = futureTask.get();
        System.out.println("result: " + result);

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
