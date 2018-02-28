package com.test.core.MultiThreading;

public class ThreadTest1 implements Runnable {

    public static void main(String[] args) {

        ThreadTest1 testRunnable = new  ThreadTest1();
        Thread t = new Thread(testRunnable);

        t.start();

    }

    @Override
    public void run(){

        System.out.println("This is my runnable thread running");

    }


}
