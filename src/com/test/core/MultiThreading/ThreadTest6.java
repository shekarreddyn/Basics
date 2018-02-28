package com.test.core.MultiThreading;

public class ThreadTest6 extends Thread {

    public static void main(String[] args) {
        ThreadTest6 test1 = new ThreadTest6();
        ThreadTest6 test2 = new ThreadTest6();
        test1.start();
        test2.start();

    }

    public void run(){

        synchronized (this){

            for(int i = 0; i<50; i++){

                if(i == 10){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println( currentThread().getName()+ ": " +i);
            }

        }


    }

}
