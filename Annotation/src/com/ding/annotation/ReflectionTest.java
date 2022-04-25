package com.ding.annotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.ding.annotation.Student");
        Method method = null;
        Method[] methods = null;

        methods = clazz.getMethods();
        for (Method mth :
                methods) {
            System.out.println(mth.getName() + " ");
        }
        Object obj = clazz.newInstance();
        method = clazz.getMethod("StudentPublicMethod", String.class);
        method.setAccessible(true);
        String result = (String) method.invoke(obj, "test");
        System.out.println(result);
        System.out.println("++++    ++++    ++++    ++++");

        methods = clazz.getDeclaredMethods();
        for (Method mth :
                methods) {
            System.out.println(mth.getName() + " ");
        }
    }
}
