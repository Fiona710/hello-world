package com.hw.demo1;

import java.lang.reflect.Field;

public class LengthValidator {

    public static String validateField(Object object) throws IllegalAccessException {

        Field[] fields = object.getClass().getDeclaredFields();

        for(Field field : fields){

            if(field.isAnnotationPresent(Length.class)){
                Length length = field.getAnnotation(Length.class);

                field.setAccessible(true);

                int value = ((String)field.get(object)).length();

                if(value < length.min() || value > length.max()){
                    return length.errorMsg();
                }
            }

        }

        return null;

    }
}
