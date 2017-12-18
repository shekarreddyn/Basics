package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdvancedHashMapTest {

    public static void main(String[] args) {


        // Latest value with same keys gets updated in Map.
        // Multiple Null Values are allowed
        // Only single null key is allowed
        // No duplicate keys are allowed, if comes any, teh latestvalue will be considered
        // An entry with null key is always stored at a place to get faster searching

        Map<Integer, String> testMap = new HashMap<Integer, String>();

        testMap.put(null, "Satyam");
        testMap.put(2, null);
        testMap.put(3, "Satyam");
        testMap.put(4, "Archana");
        testMap.put(5, "Shailey");
        testMap.put(6, null);
        testMap.put(3, "Satyam");

        Set<Integer> keySet = testMap.keySet();

        for(Integer key : keySet){

            System.out.println(key+" :  "+testMap.get(key));
        }








    }

}
