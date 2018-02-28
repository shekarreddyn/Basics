package com.test.core.MultiThreading;

/*1. Create two runnable threads. Make them loop through 500 numbers.
if any thread reaches number multiple of 100(like 100,200,300...) than make it sleep and
 let other thread run.*/

public class ThreadAssignment1 implements Runnable {

    public static void main(String[] args) {
        ThreadAssignment1 t1 = new ThreadAssignment1();
        ThreadAssignment1 t2 = new ThreadAssignment1();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.setName("Alpha");
        thread2.setName("Beta");

        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {

            System.out.println(Thread.currentThread().getName()+":" + i);

            if(i%100 ==0){

                    Thread.currentThread().yield();

            }

        }

    }
}

