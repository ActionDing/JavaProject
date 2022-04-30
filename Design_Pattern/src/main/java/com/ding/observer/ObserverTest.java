package com.ding.observer;

/**
 * @author Actionding
 * @create 2022-04-30 18:55
 */
public class ObserverTest {
    public static void main(String[] args) {
        ToBeObserverImpl tboi = new ToBeObserverImpl();

        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();


        tboi.addObserver(observerA);
        tboi.addObserver(observerB);

        tboi.notifyObserver("Help");

        System.out.println();

        tboi.removeObserver(observerA);
        tboi.notifyObserver("Help");
    }
}
