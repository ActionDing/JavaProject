package com.ding.observer;

/**
 * 观察者设计模式
 *
 * 观察者接口
 *
 * @author Actionding
 * @create 2022-04-30 18:48
 */
public interface Observer {
    void handleNotify(String message);
}
