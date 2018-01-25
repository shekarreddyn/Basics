package com.test.collections.List;

import java.util.*;

public class SortingListTest6 {
    public static void main(String[] args) {
        Person p1 = new Person("Shekar", "Hyderabad",25, "M");
        Person p2 = new Person("Sumanth", "Warangal", 26, "M");
        Person p3 = new Person("Hema", "Vizag", 24, "F");
        Person p4 = new Person("Karthik", "Banglore", 24, "M");
        Person p5 = new Person("Omkar", "Chennai", 26, "M");

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Collections.sort(personList);


        for (Person object: personList) {
            System.out.println(object.getName()+": "+ object.getAge());

        }


    }

}
