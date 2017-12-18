package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericMapTest {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<Integer, String>();

        studentsMap.put(101,"Shekar");
        studentsMap.put(102,"Tilak");
        studentsMap.put(103,"Satyam");
        studentsMap.put(104,"Rahul");
        studentsMap.put(105,"Aakash");


        Set<Integer> keySet = studentsMap.keySet();
        for(Integer rollNumber :keySet){
            System.out.println(rollNumber + " "+ studentsMap.get(rollNumber));
        }


        Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();

        for(Map.Entry entry : entries){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}
