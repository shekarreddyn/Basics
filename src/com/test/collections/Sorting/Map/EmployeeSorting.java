package com.test.collections.Sorting.Map;

import com.test.collections.Sorting.Map.Employee1;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class EmployeeSorting {

    public static void main(String[] args) {

        Employee1Comparator ec1 = new Employee1Comparator();

        Map<Employee1, Integer> employeeMap = new TreeMap<Employee1, Integer>(ec1);
        Employee1 e1 = new Employee1(104, "Shekar" , "IT", 3500);
        Employee1 e2 = new Employee1(106, "Sunil", "IT", 4400);
        Employee1 e3 = new Employee1(108, "Sai", "IT", 3800);
        Employee1 e4 = new Employee1(116, "Anita", "Networking", 4500);
        Employee1 e5 = new Employee1(124, "Sumanth", "Help Desk", 1800);

        employeeMap.put(e1, 106);
        employeeMap.put(e2, 104);
        employeeMap.put(e3, 32);
        employeeMap.put(e4, 56);
        employeeMap.put(e5, 78);



        // using keyset
        Set<Employee1> emp = employeeMap.keySet();

        for (Employee1 e:emp) {
           System.out.println(employeeMap.get(e));
        }
    }
}
