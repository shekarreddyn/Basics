package com.test.collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {


        Set<Integer> testSet = new HashSet<Integer>();

        testSet.add(1);
        testSet.add(13);
        testSet.add(2);
        testSet.add(5);
        testSet.add(9);


        for(Integer obj : testSet){

            System.out.println(obj);
        }


    }
}
