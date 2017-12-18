package com.test.collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest2 {

    public static void main(String[] args) {

        Map<Integer, Integer> mapTest = new LinkedHashMap<Integer, Integer>();
        mapTest.put(null, 1);
        mapTest.put(1,2);


        for(Map.Entry<Integer, Integer> entry : mapTest.entrySet()){


            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}
