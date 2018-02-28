package com.test.core.MultiThreading;

public class ThreadTest2 extends Thread {

    @Override
    public void run(){


        for(int i = 0; i < 5; i++){


            try{

                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " : "+i);

            }catch(Exception e){


            }

        }


    }

    public static void main(String[] args) {

        ThreadTest2 thread = new ThreadTest2();
        ThreadTest2 thread1 = new ThreadTest2();
        thread.setName("Shekar Thread");
        thread1.setName("Reddy Thread");
        thread.start();
        thread1.start();

    }

}
