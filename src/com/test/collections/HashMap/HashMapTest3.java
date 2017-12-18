package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.*;

public class HashMapTest3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ford" , "1908");
        map.put("Express Scripts", "1986");
        map.put("Mckesson", "1833");
        map.put("Apple", "1976");
        map.put("Humana", "1961");
        map.put("Chrysler", "1925");
        map.put("TMobile" , "1990");
        map.put("Samsung", "1938");

        Set Keyset = map.keySet();
        System.out.println(map);
        for(Object o : Keyset){
            System.out.println(o +" : "+map.get(o));
        }

        System.out.println();

        Set<Map.Entry> entryset = map.entrySet();
        for (Map.Entry entry :entryset)
        System.out.println(entry.getKey()+ " "+entry.getValue());

    }
}
