package com.test.collections.Sorting.Set;

import com.test.collections.List.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting1 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(14);
        set.add(36);
        set.add(16);
        set.add(22);
        set.add(5);
        set.add(34);
        set.add(12);
        set.add(9);
        set.add(32);

        Set<String> setStrings = new TreeSet<String>();
        setStrings.add("Shekar");
        setStrings.add("Sumanth");

       // PersonComparator pc = new PersonComparator();

        Set<Person> setPerson = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        Person p1 = new Person("Hema", "HYderabad", 26, "F");
        Person p2 = new Person("Sunil", "Banglore", 23, "M");

        setPerson.add(p1);
        setPerson.add(p2);

        for (Person Value: setPerson) {
            System.out.println(Value.getAge());

        }
    }


}
