package com.practice;

public class MethodOnString {

    final float CONST_VALUE;

    public MethodOnString() {
        CONST_VALUE = 123;

    }

    public MethodOnString(float const_value) {
        CONST_VALUE = const_value;
    }

    public static void main(String[] args) {

        String city = new String("abc");

        String city1 = "abc";

        if (city.equals(city1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        MethodOnString ms = new MethodOnString();
        System.out.println(ms.CONST_VALUE);

        MethodOnString ms1 = new MethodOnString(45.0F);
        System.out.println(ms1.CONST_VALUE);

    }

}
