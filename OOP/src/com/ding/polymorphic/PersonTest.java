package com.ding.polymorphic;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Animal dog = new Dog("小花");
        Animal cat = new Cat("富贵");
        person.feed(dog);
        person.feed(cat);
    }
}
