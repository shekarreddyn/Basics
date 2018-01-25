package com.test.core.oops;

public class Parent extends ParentParent {

    private Parent(){
        this("Good night");
       // System.out.println("parent class constructor");

    }

   public Parent(String message){

       System.out.println(message);
   }

}
