package com.ding.thread;

import org.testng.annotations.Test;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    @Test
    public void myThreadTest() {
        MyThread thread = new MyThread();
        thread.setName("MyThread");
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
