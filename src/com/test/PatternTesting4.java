package com.test;
/*
        1****
        12***
        123**
        1234*
        12345


        */

public class PatternTesting4 {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++) {
            for(int j=1; j<=5; j++) {

                if(j <= i){
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }




            }
            System.out.println();
        }
    }
}