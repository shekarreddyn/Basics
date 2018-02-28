package com.test.core.MultiThreading;


/*2. In the above example if thread reached those numbers, make them sleep but not give
other thread a chance. In other words, the thread who started, should finish and then other
thread will start executing. (Hint : synchronization can be used.)*/

public class ThreadAssignment2 implements Runnable {

    public static void main(String[] args) {

        ThreadAssignment2 t1 = new ThreadAssignment2();
        ThreadAssignment2 t2 = new ThreadAssignment2();

        Thread test1 = new Thread(t1);
        Thread test2 = new Thread(t2);

        test1.setName("Gamma");
        test2.setName("Delta");

        test1.start();
        test2.start();
    }

    @Override
    public synchronized void run() {
        for(int i =0; i<500; i++){
            if(Thread.currentThread().getName().equals("Gamma")) {
                System.out.println(Thread.currentThread().getName()+":"+ i);
				/*if(i == 100 || i == 200 || i==300 || i==400 || i==500) {
					try {
						Thread.currentThread().sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
            }
        }
    }

}