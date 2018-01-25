package com.test.collections.List;
/*
2. Create a list of integers.
        Find out how many duplicates values it is having and print them all.
        from non duplicate values, find out how many of them are even and how many of them are odd. print them all and
        count as well.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.util.*;

public class ListTest4 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(16);
        integerList.add(7);
        integerList.add(6);
        integerList.add(4);
        integerList.add(4);
        integerList.add(9);
        integerList.add(11);
        integerList.add(7);
        integerList.add(18);
        integerList.add(10);

        int evenSum =0;
        int oddSum =0;
        Set<Integer> integerSet = new TreeSet<Integer>();
        for (Integer intValue : integerList) {

            if(integerSet.add(intValue) == false){

                System.out.println(integerList.get(intValue));

            }

        }
        System.out.println("After removing the duplicate values the remaining values in the set are "+integerSet);
        Set<Integer> evenSet = new TreeSet<Integer>();
        Set<Integer> oddSet = new TreeSet<Integer>();
        for (Integer intValue : integerSet) {

            if (intValue % 2 == 0) {
                evenSet.add(intValue);

            } else {
                oddSet.add(intValue);
            }

        }
        int evenSetSize = evenSet.size();
        int oddSetSize = oddSet.size();
        System.out.println("The non duplicate even numbers in the set are "+ evenSet);
        System.out.println("The non duplicate odd numbers in the set are "+ oddSet);

        System.out.println("The count of even numbers is "+evenSetSize);
        System.out.println("The count of odd numbers is "+oddSetSize);
        for (Integer intEven:evenSet) {

            evenSum = evenSum+ intEven;
        }
        for (Integer oddNumber:oddSet) {
            oddSum= oddSum + oddNumber;
        }

        System.out.println("the toital sum of odd numbers in the set is " + oddSum);
        System.out.println("the toital sum of even numbers in the set is " + evenSum);
    }
}
