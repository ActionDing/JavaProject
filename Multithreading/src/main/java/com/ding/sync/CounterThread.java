package com.ding.sync;

/**
 * @author Actionding
 * @create 2022-04-25 18:03
 */
class Counter {
    private int count = 0;

    public synchronized void incr() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}

public class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incr();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread(counter);
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

        System.out.println(counter.getCount());
    }
}
