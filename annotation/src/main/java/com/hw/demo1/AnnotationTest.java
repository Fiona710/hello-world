package com.hw.demo1;

public class AnnotationTest {

    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person();
        p.setId("001");
        p.setName("xxxxixiixixi76543234567865434567876543456765434567654345678765434567");
        p.setAge(24);

        String validateField = LengthValidator.validateField(p);

        if(validateField == null){
            System.out.println(p);
        }else{
            System.out.println(validateField);
        }

    }
}
