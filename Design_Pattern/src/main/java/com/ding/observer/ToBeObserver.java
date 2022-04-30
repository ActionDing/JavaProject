package com.ding.observer;

/**
 * 被观察者接口
 *
 * @author Actionding
 * @create 2022-04-30 18:50
 */
public interface ToBeObserver {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);
}
