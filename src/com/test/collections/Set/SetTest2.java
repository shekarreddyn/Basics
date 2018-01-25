package com.test.collections.Set;

//  take out all the string values sort them and print all.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Hyderabad", 101);
        map.put("Chennai", 144);
        map.put("Banglore", 174);
        map.put("Pune", 182);
        map.put("Agra", 101);
        map.put("Jaipur", 174);
        map.put("Delhi", 116);
        map.put("Kerala", 134);
        map.put("Ranchi", 158);
        map.put("Bandra", 98);

        Set<String> set = map.keySet();
        Set<String> treeSet = new TreeSet<String>(set);
        for (String name : treeSet) {
            System.out.println(name);
        }

        Set<Integer> treeSet1 = new TreeSet<Integer>();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            //  eliminate duplicates from them sort them and print all
            treeSet1.add(entry.getValue());

        }
        for (Integer values : treeSet1) {
            System.out.println(values);

        }

    }
}
