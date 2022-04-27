package com.ding.annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        CustomDescriptions annotations = new Student().getClass().getAnnotation(CustomDescriptions.class);
        for (CustomDescription annotation :
                annotations.value()) {
            System.out.println("description: " + annotation.description());
        }
    }
}
