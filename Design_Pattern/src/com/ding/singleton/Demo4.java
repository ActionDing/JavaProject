package com.ding.singleton;

/**
 * 懒汉式 2
 *      线程安全
 *
 */
public class Demo4 {
    public static void main(String[] args) {

    }

    static class Singleton {
        private Singleton() {}

        private static Singleton instance = null;

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
//        效率稍差
//        public static Singleton getInstance() {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//                return instance;
//            }
//        }
    }
}
