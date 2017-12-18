package com.test.collections.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest2
{
    public static void main(String[] args) {
        Map<String , Integer> map = new TreeMap<String, Integer>();
        map.put("Hyderabad", 66);
        map.put("Chennai", 61);
        map.put("Banglore",88);

        for(String key: map.keySet()){

            System.out.println(key+" "+map.get(key));
        }
    }
}
