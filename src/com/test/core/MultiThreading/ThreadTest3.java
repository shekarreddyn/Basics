package com.test.core.MultiThreading;

public class ThreadTest3 extends Thread {


    static volatile int number = 1;

    public static void main(String[] args) {
        ThreadTest3 test1 = new ThreadTest3();
        ThreadTest3 test2 = new ThreadTest3();
        ThreadTest3 test3 = new ThreadTest3();

        test1.start();
        test1.setName("Ravi");
        test2.start();
        test2.setName("Anil");
        test3.start();
        test3.setName("Somu");

    }

    public void run() {

        for (int i = 1; i<= number&& number<50; number++) {

            if (number % 2 != 0) {
                try {

                    System.out.println(Thread.currentThread().getName() + ":" + number);

                    Thread.sleep(2000);
                } catch (Exception e) {
                }


            }
        }
    }
}
