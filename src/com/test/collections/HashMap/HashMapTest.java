package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {


        Map m = new HashMap();
        m.put("name", "shekar");
        m.put("city", "hyderabad");


        Set<Map.Entry> entrySet = m.entrySet();

        for(Map.Entry entry : entrySet){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set keySet = m.keySet();

        for(Object key : keySet ){

            if(key == "city"){
                System.out.println(m.get(key));
            }
         }








    }
}
