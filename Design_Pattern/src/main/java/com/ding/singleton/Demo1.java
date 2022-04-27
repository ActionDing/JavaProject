package com.ding.singleton;

/**
 * 饿汉式 1
 */
public class Demo1 {
    public static void main(String[] args) {

    }

    static class Singleton {
        private Singleton(){}

        private static Singleton instance = new Singleton();

        public static Singleton getInstance() {
            return instance;
        }
    }
}
