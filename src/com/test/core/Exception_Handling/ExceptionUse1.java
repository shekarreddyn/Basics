package com.test.core.Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

public class ExceptionUse1 {


    public static void main(String[] a) {

        try {
            int num = 7;// this number is coming from user

            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[num]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounf exception");
        }
        catch (Exception e) {
            System.out.println("The array index exception is handled");
        }
        finally{
            System.out.println("This block will execute always");
        }
    }

}
