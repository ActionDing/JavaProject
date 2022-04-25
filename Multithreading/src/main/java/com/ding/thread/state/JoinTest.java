package com.ding.thread.state;

// 插队
public class JoinTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("vip" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();


        for (int i = 0; i < 500; i++) {
            System.out.println("main" + i);;
            if (i == 50) {
                thread.join();
            }
        }
    }
}
