package com.test.collections.List;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.ArrayList;

public class SortingEmployee {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();

        Employee e1 = new Employee("Shekar", 116, "IT", 24);
        Employee e2 = new Employee("Hema", 109, "Testing", 24);
        Employee e3 = new Employee("Sumanth", 101, "Networking", 26);
        Employee e4 = new Employee("omkar", 105, "Customer Service" , 23);
        Employee e5 = new Employee("Madhuri", 136, "IT", 23);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Collections.sort(empList);

        for (Employee empValue:empList) {
            System.out.println(empValue.getName()+": "+ empValue.getAge()+":"+empValue.getId()+":"+empValue.getDepartment());

        }
    }
}
