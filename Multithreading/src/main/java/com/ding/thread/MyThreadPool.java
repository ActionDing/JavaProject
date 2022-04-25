package com.ding.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.execute(new MyRunnable()); // execute() 方法适用于 Runnable 接口
//            threadPoolExecutor.submit(new MyCallable<>()); // submit() 方法适用于 Callable 接口
            System.out.println(Thread.currentThread().getName());
        }

        threadPoolExecutor.shutdown();
    }
}
