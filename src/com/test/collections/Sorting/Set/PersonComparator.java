package com.test.collections.Sorting.Set;

import com.test.collections.List.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compare(Person p1 , Person p2){
        return p1.getAge() - p2.getAge();
    }
}
