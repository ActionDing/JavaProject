package com.ding.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Actionding
 * @create 2022-04-26 19:07
 */
public class SimpleJDKDynamicProxyDemo {

    interface IService {
        void sayHello();
    }

    static class RealService implements IService {
        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler {

        private final Object realObj;

        public SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering " + method.getName());
            Object result = method.invoke(realObj, args);
            System.out.println("leaving " + method.getName());
            return result;
        }
    }

    public static void main(String[] args) {
        RealService realService = new RealService();
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
                new Class<?>[]{IService.class},
                new SimpleInvocationHandler(realService));
        proxyService.sayHello();
    }
}
