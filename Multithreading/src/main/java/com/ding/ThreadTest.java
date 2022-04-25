package com.ding;

import org.testng.annotations.Test;

/**
 * @author Actionding
 * @create 2022-04-25 17:42
 */
public class ThreadTest {
    @Test
    public void testRunnable() {
        HelloCRunnable runnable = new HelloCRunnable();
        Thread thread = new Thread(runnable);

        thread.start();
        System.out.println(Thread.currentThread().getName() + ": main");
    }

    class HelloCRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Hello");
        }
    }

    @Test
    public void testThread() {
        HelloThread thread = new HelloThread();
        thread.start();
        System.out.println(Thread.currentThread().getName() + ": main");
    }

    class HelloThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Hello");
        }
    }
}
