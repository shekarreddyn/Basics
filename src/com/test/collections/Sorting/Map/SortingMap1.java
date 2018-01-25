package com.test.collections.Sorting.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import com.test.collections.HashMap.Person;

public class SortingMap1 {

    public static void main(String[] args) {
        Map<Person, Integer> mapSort = new TreeMap<Person, Integer>();

        Person p1 = new Person("Shekar", 24, "Hopkins");
        Person p2 = new Person("Vishnu", 25, "Chicago");
        Person p3 = new Person("Subash", 24, "Carolina");

        mapSort.put(p1, 106);
        mapSort.put(p2, 106);
        mapSort.put(p3, 106);

        Set<Person> personSet =mapSort.keySet();
        for (Person property: personSet) {
            System.out.println(property.getName() + ":" + mapSort.get(property));
        }

    }
}
