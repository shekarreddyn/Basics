package com.test.core.Exception_Handling;

import java.io.*;

public class CheckedException1 {

    public static void main(String[] args) {

        BufferedReader fileInput = null;

        try {

            FileReader file = new FileReader("C:\\test\\a.txt");

            fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());
        }


        catch (Exception e) {
            System.out.println("File not found exception is handled");
        }

        finally {
            try {
                fileInput.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}

