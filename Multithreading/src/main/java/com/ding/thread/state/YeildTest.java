package com.ding.thread.state;

// 礼让不一定成功
public class YeildTest {

    public static void main(String[] args) {
        MyYield myYield = new MyYield();

        new Thread(myYield, "A ").start();
        new Thread(myYield, "B ").start();
    }

}

class MyYield implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " stop");
    }
}
