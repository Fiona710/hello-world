package com.hw.demo1;


import java.lang.annotation.*;

/**
 * 定义一个注解@Length
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Length {
    int min();

    int max();

    String errorMsg();
}
