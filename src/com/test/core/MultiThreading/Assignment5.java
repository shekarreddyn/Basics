package com.test.core.MultiThreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment5 extends Thread {

    public static void main(String[] args) {

        Assignment5 assignment1 = new Assignment5();
        Assignment5 assignment2 = new Assignment5();
        Assignment5 assignment3 = new Assignment5();
        Assignment5 assignment4 = new Assignment5();
        Assignment5 assignment5 = new Assignment5();

        Map<String, Thread> threadMap = new HashMap<String, Thread>();

        assignment1.setName("ThreadOne");
        assignment2.setName("ThreadTwo");
        assignment3.setName("ThreadThree");
        assignment4.setName("ThreadFour");
        assignment5.setName("ThreadFive");

        threadMap.put(assignment1.getName(), assignment1);
        threadMap.put(assignment2.getName(), assignment2);
        threadMap.put(assignment3.getName(), assignment3);
        threadMap.put(assignment4.getName(), assignment4);
        threadMap.put(assignment5.getName(), assignment5);

       Set<Map.Entry<String, Thread>> threadEntries = threadMap.entrySet();

        for (Map.Entry<String, Thread> threadEntry: threadEntries) {
            threadEntry.getValue().start();

        }

    }

    public void run(){
        System.out.println(currentThread().getName());
    }


}
