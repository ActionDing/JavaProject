package com.ding.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(CustomDescriptions.class)
public @interface CustomDescription {
    String description() default "";
}
