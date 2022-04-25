package com.ding.polymorphic.test;

public class Cat extends Animal {

    public int field = 2;

    public int getField (){
        return field;
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat() " + this.name);
    }
}
