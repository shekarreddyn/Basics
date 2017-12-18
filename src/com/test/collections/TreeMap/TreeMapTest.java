package com.test.collections.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapTest {

    public static void main(String[] args) {

        Map test = new TreeMap();
        test.put(1, "tilak");
        test.put(2, 2);
        test.put(3, 0);

        for (Object entry : test.entrySet()) {

            Map.Entry entryObj = (Map.Entry) entry;
            System.out.println(entryObj.getKey());
            System.out.println(entryObj.getValue());
        }

        Map<String, Integer> mapTest = new TreeMap<String, Integer>();

        mapTest.put("Tilak", 1);
        mapTest.put("Shekar", 2);
        mapTest.put("Satyam", 3);
        mapTest.put("Raju", 4);
        mapTest.put("Haider", 5);
        mapTest.put("Virat", 6);
        mapTest.put("Vikram", 7);


        for (Map.Entry<String, Integer> entry : mapTest.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }


    }

}
