package com.ding.sync;

/**
 * @author Actionding
 * @create 2022-04-25 18:24
 */
public class BlockThread {
    /**
     * 锁为对象
     *
     */
    /*
    class Counter {
        private int count = 0;

        public void incr() {
            synchronized (this) {
                count++;
            }
        }

        public synchronized int getCount() {
            synchronized (this) {
                return count;
            }
        }
    }*/

    /**
     * 与上面的等价，锁为Object对象
     * 任何对象都可以作为锁对象
     */
    /*
    class Counter {
        private int count = 0;
        private Object lock = new Object();

        public void incr() {
            synchronized (lock) {
                count++;
            }
        }

        public synchronized int getCount() {
            synchronized (lock) {
                return count;
            }
        }
    } */


    /**
     * 锁为StaticCounter类
     *
     */
    /*
    class StaticCounter {
        private static int count = 0;

        public static void incr() {
            synchronized (StaticCounter.class) {
                count++;
            }
        }
        public static int getCount() {
            synchronized (StaticCounter.class) {
                return count;
            }
        }
    }*/
}
