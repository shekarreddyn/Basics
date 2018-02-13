package com.test.core.Exception_Handling;

public class ExceptionTest3 {

    public static void main(String[] args) {

        ExceptionTest3 test1 = new ExceptionTest3();
        try {
            test1.div(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void div(int numb1, int numb2) throws Exception {

        throw new Exception();

    }

}


// Runtime exceptions are not required to handle











