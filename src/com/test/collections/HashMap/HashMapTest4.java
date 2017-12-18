package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest4 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Id" , "101");
        map.put("Name", "Shekar");
        map.put("Company" , "Mckesson");
        map.put("Employer", "FastSwitch");
        map.put("location", "minneapolis");
        map.put("Role", "developer");

        Set Keyset = map.keySet();
        for (Object o: Keyset) {
            System.out.println(o+ "  " +map.get(o));


            Set<Map.Entry> entryset = map.entrySet();
            for(Map.Entry entry : entryset){
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }

        }
    }
}
