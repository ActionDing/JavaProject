package com.ding.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Inherited
public @interface MyAnnotations {
    MyAnnotation[] value();
}
