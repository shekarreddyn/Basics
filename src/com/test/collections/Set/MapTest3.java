package com.test.collections.Set;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapTest3 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(164, 312);
        map.put(148, 514);
        map.put(56, 471);
        map.put(12, 13);
        map.put(101, 133);
        map.put(156, 13);
        map.put(166, 514);
        map.put(14, 148);
        map.put(112, 471);
        map.put(16, 6);
        // System.out.println(map);

        // sort the unique keys, find the sum and find the average of it.

        int sumOfKeys = 0;
        int avgOfKeys = 0;
        int avgOfValues = 0;
        int sumOfUniqueValues = 0;
        Set<Integer> treeSetKey = new TreeSet<Integer>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        Set<Integer> keySet = map.keySet();

        for (Entry<Integer, Integer> entry : entries) {
            treeSetKey.add(entry.getKey());
        }
        for (Integer number : treeSetKey) {
            sumOfKeys = sumOfKeys + number;
        }
        avgOfKeys = sumOfKeys / treeSetKey.size();

        System.out.println("The Sorted set of given keys are" + " : " + treeSetKey);
        System.out.println("The total sum of all keys are " + " : " + sumOfKeys);
        System.out.println("The average of all keys is " + " : " + avgOfKeys);

        System.out.println();

        Set<Integer> treeSetValues = new TreeSet<Integer>();
        for (Entry<Integer, Integer> entry : entries) {
            treeSetValues.add(entry.getValue());
        }
        for (Integer values : treeSetValues) {
            sumOfUniqueValues = sumOfUniqueValues + values;
        }
        avgOfValues = sumOfUniqueValues / treeSetValues.size();

        System.out.println("The Unique Values are " + " : " + treeSetValues);
        System.out.println("The sum of unique values is" + " : " + sumOfUniqueValues);
        System.out.println("The Avg of all Unique values is " + ": " + avgOfValues);
    }
}