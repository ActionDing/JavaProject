package com.ding.polymorphic.test;

import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person = new Person();
    Animal dog = new Dog("小花", 5);
    Animal cat = new Cat("富贵", 2);

    @Test
    public void test01() {
        System.out.println(dog.field);
        System.out.println(dog.getField());
    }
}
