package com.ding.thread.state;

public class DaemonTest {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true);

        thread.start();

        new Thread(you).start();

    }
}

class God implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("God");
        }
    }
}

class You implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("You");
        }
    }
}
