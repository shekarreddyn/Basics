package com.test.core.MultiThreading;

public class Assignment3 extends Thread {

    public static void main(String[] args) {

        Assignment3 assignment1 = new Assignment3();
        Assignment3 assignment2 = new Assignment3();

        assignment1.start();
        assignment2.start();

    }

    public void run(){
        System.out.println(currentThread().getName());
    }
}
