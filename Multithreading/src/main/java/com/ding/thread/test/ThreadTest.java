package com.ding.thread.test;

public class ThreadTest implements Runnable {
    private int ticketnums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketnums <= 0) {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 拿到了第\t" + ticketnums-- + "\t张票");
        }
    }

    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();


        new Thread(thread, "A").start();
        new Thread(thread, "B").start();
        new Thread(thread, "C").start();
    }
}


