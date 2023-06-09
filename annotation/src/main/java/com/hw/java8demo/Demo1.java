package com.hw.java8demo;

import java.util.function.Predicate;

public class Demo1 {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Predicate<String> predicate = new Predicate<String>(){

            @Override
            public boolean test(String s) {
                return s.equals("zhangsan");
            }
        };

        System.out.println(predicate.test("zhangsan"));
        System.out.println(predicate.test("lisi"));
    }


}
