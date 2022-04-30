package com.ding.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Actionding
 * @create 2022-04-30 18:53
 */
public class ToBeObserverImpl implements ToBeObserver {

    List<Observer> observers;

    public ToBeObserverImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer o : observers) {
            o.handleNotify(message);
        }
    }
}
