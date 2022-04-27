package com.ding.annotation;

/**
 * 基类
 */
@CustomDescription(description = "基类")
@CustomDescription(description = "人")
//@MyAnnotations({@MyAnnotation(value = "hi"), @MyAnnotation(value = "hello")}) // JDK 8之前
@MyAnnotation(value = "hi")
@MyAnnotation(value = "hello")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String PersonPublicMethod(String str) {
        return str;
    }

    public Person(String name) {
        this.name = name;
    }

    private String PersonPrivateMethod(String str) {
        return str;
    }

    public Person() {
    }
}
