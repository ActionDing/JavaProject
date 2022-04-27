package com.ding.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface UserService {
    void add();
}

class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加数据操作");
    }
}

class MyTestInvocationHandler implements InvocationHandler {

    private Object target;

    public MyTestInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强方法1");
        Object returnValue = method.invoke(target, args);
        System.out.println("增强方法2");
        return returnValue;
    }
}

public class MyProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyTestInvocationHandler handler = new MyTestInvocationHandler(userService);
        UserService proxyObject = (UserService) Proxy.newProxyInstance(MyProxyTest.class.getClassLoader(), userService.getClass().getInterfaces(), handler);
        proxyObject.add();
    }
}
