package com.ding.polymorphic;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat() " + this.name);
    }
}
