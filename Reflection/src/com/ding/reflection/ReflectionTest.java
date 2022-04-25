package com.ding.reflection;

import com.ding.Person;
import org.junit.jupiter.api.Test;

public class ReflectionTest {

    /**
     * 获取 Class 对象的四种方法
     *
     *
     */
    @Test
    public void test1() throws ClassNotFoundException {
        Class<Person> clazz1 = Person.class;

        Person person = new Person();
        Class<? extends Person> clazz2 = person.getClass();

        Class<?> clazz3 = Class.forName("com.ding.Person");

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.ding.Person");

        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println(clazz4);
    }
}
