package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("camry", "2010");
        map.put("verna", "2014");
        map.put("Duster", "2014");
        map.put("innova", "2012");
        map.put("nano", "2013");

        // printing both keys and values
        Set keyset = map.keySet();

        for (Object o : keyset) {
            System.out.println(o + " " + map.get(o));


        }
        Set<Map.Entry> entryset = map.entrySet();

        for(Map.Entry entry :entryset){

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
