package com.ding.singleton;

/**
 * 懒汉式 1
 *      线程不安全
 */
public class Demo3 {
    public static void main(String[] args) {

    }

    static class Singleton {
        private Singleton(){}

        private static Singleton instance = null;

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
