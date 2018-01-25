package com.test.collections.Sorting.Map;

import java.util.Comparator;

public class Employee5Comparator implements Comparator<Employee5> {

    @Override
    public int compare(Employee5 o1, Employee5 o2) {

        return  (int) (o2.getSalary() - o1.getSalary());
    }


}