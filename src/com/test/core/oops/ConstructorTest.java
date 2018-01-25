package com.test.core.oops;

public class ConstructorTest {

    /*public ConstructorTest(){

        System.out.println("Object is created");
    }*/

    public ConstructorTest(String message){

        System.out.println(message);
    }


    private ConstructorTest(){

        System.out.println("I AM PRIVATE...");
    }


    public static void main(String[] args){

        ConstructorTest test = new ConstructorTest();
        test = new ConstructorTest();
        test = new ConstructorTest();
        test = new ConstructorTest();
        test = new ConstructorTest();

/*
        ConstructorTest t1 = new ConstructorTest("I am getting created...");*/



    }
}
