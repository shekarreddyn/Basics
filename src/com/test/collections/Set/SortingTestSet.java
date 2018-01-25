package com.test.collections.Set;

import com.test.collections.List.Person;

import java.util.*;
import java.util.List;

public class SortingTestSet {

    public static void main(String[] args) {

        Person p1 = new Person("Shekar", "Hyderabad", 25, "M");
        Person p2 = new Person("Sumanth", "Warangal", 26, "M");
        Person p3 = new Person("Hema", "Vizag", 24, "F");
        Person p4 = new Person("Karthik", "Banglore", 24, "M");
        Person p5 = new Person("Omkar", "Chennai", 26, "M");

        Set<Person> personSet = new HashSet<Person>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        //Collections.sort(personSet);

    }

}
