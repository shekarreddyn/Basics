package com.test.collections.HashMap;
//2. Create a HashMap which stores Integer as Key which will be roll number and Person Object as Value. Create 5 entries.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest6 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        p1.setName("Karthik");
        p1.setAge(24);
        p1.setCity("Hyderabad");

        p2.setName("Shekar");
        p2.setAge(25);
        p2.setCity("Banglore");

        p3.setName("Sravan");
        p3.setAge(21);
        p3.setCity("Chennai");

        p4.setName("Mani");
        p4.setAge(26);
        p4.setCity("Mumbai");

        Map<Integer, Person>  map = new HashMap<Integer, Person>();
        map.put(101,p1);
        map.put(102,p2);
        map.put(103,p3);
        map.put(104,p4);

        //  Print this pattern : name : age : roll no : city

        Set<Integer> keyset = map.keySet();

        for(Integer key : keyset){


        }



    }
}
