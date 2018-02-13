package com.test.collections.HashMap;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest10 {

    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<String, Person>();
        Person p1 = new Person("Shekar", 24, "Minneapolis");
        Person p2 = new Person("Srikar", 27, "Dearborn");
        Person p3 = new Person("Sumanth", 26, "Detroit");
        Person p4 = new Person("Manish", 24, "Austin");
        Person p5 = new Person("Anil", 25, "Delhi");

        map.put("Eo1", p1);
        map.put("Eo2", p2);
        map.put("Eo3", p3);
        map.put("Eo4", p4);
        map.put("Eo5", p5);

        /*Person p = map.get("Eo3");
        System.out.println(p.getAge());*/

        Set<String> employeeIdSet = map.keySet();

        for(String employeeId : employeeIdSet){

           Person personObj =  map.get(employeeId);
            System.out.println(personObj.getName());
        }

       Set<Map.Entry<String, Person>> entries = map.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
