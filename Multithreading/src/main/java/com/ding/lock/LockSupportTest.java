package com.ding.lock;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Actionding
 * @create 2022-04-26 10:17
 */
public class LockSupportTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            LockSupport.park(); // 放弃CPU
            System.out.println("exit");
        });
        thread.start();
        Thread.sleep(1000);
        LockSupport.unpark(thread);
    }
}
