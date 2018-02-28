package com.test.core.MultiThreading;

public class Test1 {

    public static void main(String[] args) {
        for(int i=0; i<500; i++){
            if(i%100 == 0){
                System.out.println(i);
            }
        }
    }
}
