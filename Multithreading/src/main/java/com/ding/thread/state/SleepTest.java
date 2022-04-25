package com.ding.thread.state;

import java.util.Scanner;

public class SleepTest implements Runnable {
    private int ticketNums = 10;


    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ticketNums--);
        }
    }

    public static void main(String[] args) {
        SleepTest sleepTest = new SleepTest();

        new Thread(sleepTest, "AA ").start();
        new Thread(sleepTest, "BB ").start();
        new Thread(sleepTest, "CC ").start();
    }
}
