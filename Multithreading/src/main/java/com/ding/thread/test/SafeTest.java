package com.ding.thread.test;

public class SafeTest implements Runnable {
    private int count = 5;

    @Override
    // 多线程在执行run方法时排队等待
    synchronized public void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " 计算 " + count);
    }

    public static void main(String[] args) {
        SafeTest myThread = new SafeTest();
        new Thread(myThread, "a").start();
        new Thread(myThread, "b").start();
        new Thread(myThread, "c").start();
        new Thread(myThread, "d").start();
        new Thread(myThread, "e").start();
    }
}