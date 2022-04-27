package com.ding.di;

/**
 * @author Actionding
 * @create 2022-04-26 17:39
 */
public class ServiceA {
    @SimpleInject
    ServiceB b;

    public void callB() {
        b.action();
    }

    public ServiceB getB() {
        return b;
    }
}
