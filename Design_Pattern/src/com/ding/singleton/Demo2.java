package com.ding.singleton;

/**
 * 饿汉式 2
 */
public class Demo2 {
    public static void main(String[] args) {

    }

    static class Singleton{
        private Singleton(){}

        private static Singleton instance = null;

        static {
            instance = new Singleton();
        }

        public static Singleton getInstance() {
            return instance;
        }
    }
}
