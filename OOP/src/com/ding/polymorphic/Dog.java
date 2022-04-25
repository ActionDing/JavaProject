package com.ding.polymorphic;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat() " + this.name);
    }
}
