package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//      I) Find out the name with maximum family members
 //        II) Same for minimum family members
public class GenericTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("shekar", 2);
        map.put("Derek", 3);
        map.put("pete", 5);
        map.put("satyam", 1);
        map.put("Marissa", 4);


        int a=0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            System.out.println(entry.getKey()+ " "+ entry.getValue());
            a= a + entry.getValue();
        }
        System.out.println("total number of families members is" + " " + a);


        System.out.println(map.get("Marissa"));
    }
}
