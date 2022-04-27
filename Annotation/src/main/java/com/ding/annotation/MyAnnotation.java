package com.ding.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Inherited
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value() default "Hello";
}
