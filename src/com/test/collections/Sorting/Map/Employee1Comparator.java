package com.test.collections.Sorting.Map;

import java.util.Comparator;

public class Employee1Comparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
