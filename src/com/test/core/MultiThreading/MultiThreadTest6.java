package com.test.core.MultiThreading;


import java.util.*;

public class MultiThreadTest6 extends Thread {


    public static void main(String[] args) {

        MultiThreadTest6 test1 = new MultiThreadTest6();
        MultiThreadTest6 test2 = new MultiThreadTest6();
        MultiThreadTest6 test3 = new MultiThreadTest6();

        test1.setName("ThreadOne");
        test2.setName("ThreadTwo");
        test3.setName("ThreadThree");

        test1.start();
        test2.start();
        test3.start();
    }

    public synchronized void run() {
        List<Integer> numberList = new ArrayList<Integer>();
        for ( int i = 1; i <= 300; i++) {
            if (currentThread().getName().equals("ThreadOne")) {
                if (i <= 100) {

                    System.out.println(currentThread().getName() + " :" + i);
                }
                }
                if (currentThread().getName().equals("ThreadTwo")) {
                    if (i > 100 && i<=200) {

                        System.out.println(currentThread().getName() + " :" + i);
                    }
                }

                if (currentThread().getName().equals("ThreadThree")) {
                    if (i > 200) {

                        System.out.println(currentThread().getName() + ":" + i);

                    }
                }

            }


        }
    }
