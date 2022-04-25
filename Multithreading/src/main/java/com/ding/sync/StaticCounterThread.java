package com.ding.sync;

/**
 * @author Actionding
 * @create 2022-04-25 18:13
 */
class StaticCounter {
    private static int count = 0;

    public static synchronized void incr() {
        count++;
    }
    public static synchronized int getCount() {
        return count;
    }
}

public class StaticCounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            StaticCounter.incr();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new StaticCounterThread();
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

        System.out.println(StaticCounter.getCount());
    }
}
