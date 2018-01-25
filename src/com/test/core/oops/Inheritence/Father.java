package com.test.core.oops.Inheritence;

public class Father {

    public void getProperty(){
        System.out.println("father version");
    }

    public void sellProperty(){
        System.out.println("I want to sell my car");
    }


    private void myPrivateStuff(){
        System.out.println("My private stuff");
    }
    public void printYourself(Father f){


    }

    public Father returnMyself(){

        return new Father();
    }



    public int doSum(int num1, int num2){

        int sum = num1+num2;
        return sum;

    }


    /*public String toString(){

        return "Father Class I AM";
    }*/

    static void myOfficeWork(){
        System.out.println("Office work not done");
    }

    public Object getNumber(){

        return 5;
    }
}
