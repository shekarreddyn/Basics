package com.test.core.staticUse;

public class StaticUse3 {

    static int a;
    static   int b;


     static {

         a= 10;
         b=20;
         System.out.println("Static block");
     }

    public static void main(String[] args) {

    }
}
