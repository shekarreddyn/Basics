package com.test.core.Exception_Handling;

public class ExceptionTest2 {

    public static void main(String[] a){

        ExceptionTest2 test = new ExceptionTest2();
        try {
            test.calculator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void calculator() throws Exception{

        /*try{

            this.validateString(null);

        } catch(Exception e){

            e.printStackTrace();
            System.out.println("exception handled");
        }*/

        throw new Exception();

    }


    public int div(int num1, int num2){

        return num1/num2;
    }


    public boolean validateNum(int num) {

        if (0 == num) {

            return false;

        } else {

            return true;
        }

    }


    public void validateString(String str) throws NullPointerException{


        if (null == str) {

            throw new NullPointerException();
        }
    }


}
