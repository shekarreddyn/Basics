package com.test.core.MultiThreading;

import java.util.*;

public class ThreadTest5 extends Thread {

    public static void main(String[] args) {
        ThreadTest5 test1 = new ThreadTest5();
        ThreadTest5 test2 = new ThreadTest5();
        ThreadTest5 test3 = new ThreadTest5();

        test1.setName("I am thread one");
        test2.setName("I am thread two");
        test3.setName("I am thread three");

        test1.setPriority(10);

        test1.start();

        test2.start();

        test3.start();

    }

    public void run(){

        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Thread started  : " + currentThread().getName());


        for(int i = 0; i<500; i++){
            list.add(i);

            if( i == 100){
                if(Thread.currentThread().getName().equals("I am thread one")){
                    Thread.currentThread().yield();
                }
            }

            if(i == 200){
                if(Thread.currentThread().getName().equals("I am Thread two")){
                    Thread.currentThread().yield();
                }
            }

            if(i==300){
                if(Thread.currentThread().getName().equals("I am thread three")){
                    Thread.currentThread().yield();
                }
            }

        }

        System.out.println("Thread completed is"+ currentThread().getName());
    }
}
