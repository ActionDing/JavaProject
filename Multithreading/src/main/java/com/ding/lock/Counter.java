package com.ding.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Actionding
 * @create 2022-04-26 9:54
 */
public class Counter {
    private final Lock lock = new ReentrantLock();
    private volatile int count;

    public void incr() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
