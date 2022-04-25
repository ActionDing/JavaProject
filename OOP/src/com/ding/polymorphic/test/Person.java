package com.ding.polymorphic.test;

public class Person {

    public void feed (Animal animal) {
//        System.out.println("Person feed()");
        animal.eat();
    }
}
