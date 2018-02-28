package com.test.core.MultiThreading;

public class ThreadTest8 implements Runnable {

    public static void main(String[] args) {

        ThreadTest8 test8 = new ThreadTest8();

        Thread t1 = new Thread(test8);
        Thread t2 = new Thread(test8);

        t1.start();
        t2.start();
    }


    @Override
    public synchronized void run() {

        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+ " :" + i);
        }
    }


}
