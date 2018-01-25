package com.test.core.staticUse;

public class StaticTest1 {


    public static int var = 1;

    public static void play(){

        System.out.println(var);
    }


    public static void main(String[] a){


       StaticTest1 obj1 = new StaticTest1();
       obj1.var = 10;
       obj1.play();

        StaticTest1.var = 16;

       StaticTest1 obj2 = new StaticTest1();
       obj2.play();







    }





}
