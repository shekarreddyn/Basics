package com.test.collections.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest1 {


    public static void main(String[] args) {



        Map<Integer, Integer> hashMapTest = new HashMap<Integer, Integer>();

        System.out.println("Insertion HashMap Start : "+System.currentTimeMillis());
        for(int i = 0; i < 1000000; i++){

            hashMapTest.put(i,i);
        }
        System.out.println("Insertion HashMap Complete : "+System.currentTimeMillis());


        Map<Integer, Integer> linkedHashMapTest = new LinkedHashMap<Integer, Integer>();
        System.out.println("Insertion LinkedHashMap Start : "+System.currentTimeMillis());
        for(int i = 0; i < 1000000; i++){

            linkedHashMapTest.put(i,i);
        }
        System.out.println("Insertion LinkedHashMap Complete : "+System.currentTimeMillis());



        Set<Integer> linkedKeySet = linkedHashMapTest.keySet();

        System.out.println("Retrival LinkedHashMap Start : "+System.currentTimeMillis());
        for(Integer key : linkedKeySet){

            linkedHashMapTest.get(key);
        }
        System.out.println("Retrival LinkedHashMap Complete : "+System.currentTimeMillis());



        Set<Integer> hashMapKeySet = hashMapTest.keySet();
        System.out.println("Retrival HashMap Start : "+System.currentTimeMillis());
        for(Integer key : hashMapKeySet){

            hashMapTest.get(key);
        }
        System.out.println("Retrival HashMap Complete : "+System.currentTimeMillis());


    }

}
