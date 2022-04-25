package com.ding.thread.state;

import com.ding.thread.test.ThreadTest;

public class StopTest implements Runnable {

    // 1 线程中定义线程体使用的标识
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        // 2 线程体使用该标识
        while (flag) {
            System.out.println("run...Thread" + i++);
        }
    }

    // 3 对外提供方法改变标识
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        StopTest stopTest = new StopTest();
        new Thread(stopTest).start();

        for (int i = 0; i < 900; i++) {
            System.out.println("main" + i);
            if (i == 500) {
                stopTest.stop();
                System.out.println("stop()");
            }
        }
    }
}
