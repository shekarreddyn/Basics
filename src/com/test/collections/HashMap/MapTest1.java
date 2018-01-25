package com.test.collections.HashMap;


        import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Map;
        import java.util.Set;
        import java.util.TreeSet;

// 1. Create a Map with roll no as key and Name as Value.


public class MapTest1 {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(101, "Shekar");
        hashMap.put(102, "Tilak");
        hashMap.put(103, "Dinesh");
        hashMap.put(104, "Karthik");
        hashMap.put(105, "Shekar");
        hashMap.put(106, "Omkar");
        hashMap.put(107, "Arun");
        hashMap.put(108, "Omkar");

        Set<String> treeSet = new TreeSet<String>();

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        for(Map.Entry<Integer, String> entry  : entrySet) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
            treeSet.add(entry.getValue());

        }

        System.out.println(treeSet);
        for(String name : treeSet){
            System.out.println(name);

        }
    }



}