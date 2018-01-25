package com.test.collections.Sorting.List;


import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee5> {


    public int compare(Employee5 o1, Employee5 o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }


}