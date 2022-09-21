package com.example.javatests.util;



public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        if (!result.equals("holaholahola")){
            System.out.println("ERROR");
        }

        String result1 = StringUtil.repeat("hola", 1);
        if (!result1.equals("hola")){
            System.out.println("ERROR");
        }
    }
}