package com.test.core.oops.Inheritence;

public class Children extends Father {

    /*public void getProperty(){
        System.out.println("Child version");
    }*/

    public void sellProperty(){
        System.out.println("Seriously ? i will have to sell my uws");
    }

    public void callMe(){


    }

    public void printYourself(Children f){


    }


    public Children returnMyself(){

        return new Children();
    }


    /*public int doSum(float num1, float num2){

        return num1+num2;
    }*/

    public Integer getNumber(){

        return 10;
    }

    public String toString(){
        return "Children ";
    }

}
