package com.ding.observer;

/**
 * @author Actionding
 * @create 2022-04-30 18:52
 */
public class ObserverA implements Observer {
    @Override
    public void handleNotify(String message) {
        System.out.println("A......");
    }
}
