package com.test.core.MultiThreading;

public class ThreadTest7 extends Thread {

    public static void main(String[] args) {
        ThreadTest7  test1 = new ThreadTest7();
        ThreadTest7  test2 = new ThreadTest7();

        test1.setName("ThreadOne");
        test2.setName("ThreadTwo");

        test1.start();
        test2.start();
    }

    public synchronized void run(){


            for(int i=0; i<100 ; i++){

               if(i==50){
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
                System.out.println(currentThread().getName()+ ":"+ i);
        }



    }
}
