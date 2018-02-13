package com.test.collections.HashMap;

import java.util.*;

public class HashMapTest11 {
    public static void main(String[] args) {
        Map<String, List<Person>> map = new HashMap<String, List<Person>>();

        List<Person> sharmaList = new ArrayList<Person>();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setName("Aravind");
        p2.setName("Mohit");
        p3.setName("Anil");

        sharmaList.add(p1);
        sharmaList.add(p2);
        sharmaList.add(p3);

        List<Person> reddyList = new ArrayList<Person>();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();

        p4.setName("Shekar");
        p5.setName("Sunil");
        p6.setName("Kushal");

        reddyList.add(p4);
        reddyList.add(p5);
        reddyList.add(p6);


        map.put("Sharma", sharmaList);
        map.put("Reddy", reddyList);


        Set<String> surnames = map.keySet();
        for (String surname : surnames) {
            System.out.println(surname);

        }

        List<Person> listPerson = map.get("Sharma");
        for (Person name : listPerson) {
            System.out.println(name);
        }

        Set<Map.Entry<String, List<Person>>> entries = map.entrySet();


        for (Map.Entry<String, List<Person>> entry : entries) {
            System.out.println("Surname:" + entry.getKey());
            List<Person> firstNamesList = entry.getValue();
            for (Person personObj : firstNamesList) {
                System.out.println(personObj.getName());

            }
        }

    }

}
