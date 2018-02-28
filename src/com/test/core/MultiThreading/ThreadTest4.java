package com.test.core.MultiThreading;

import java.util.*;

public class ThreadTest4 extends Thread {

    public static void main(String[] args) {
        ThreadTest4 test1 = new ThreadTest4();
        ThreadTest4 test2 = new ThreadTest4();

        test2.setPriority(Thread.MAX_PRIORITY);
        test1.setPriority(Thread.MAX_PRIORITY);

        test1.setName("Thread - 1");
        test2.setName("Thread - 2");

        test1.start();
        test2.start();
    }

    public void run(){

        System.out.println("Thread started : "+Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<1000; i++) {

            if(i == 500){

                System.out.println("Changing priorities");

                if(Thread.currentThread().getName().equals("Thread - 1")){

                    Thread.currentThread().yield();

                }
            }

            /*if(i == 500){

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/

            list.add(i);
        }

        long endTime  = System.currentTimeMillis();

        System.out.println("Time Taken by thread : : "+Thread.currentThread().getName()+ " is : "+(endTime-startTime));

    }

}
