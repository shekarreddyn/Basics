package com.test.collections.Set;


import java.util.*;

public class EmployeeSorting{

    public static void main(String[] args) {

        EmployeeComparator empCr = new EmployeeComparator();

        // Set<Employee> empSet = new TreeSet<Employee>(empCr);

        Set<Employee> empSet = new TreeSet<Employee>(new Comparator<Employee>() {

            public int compare(Employee o1, Employee o2) {

                return o1.getAge() -  o2.getAge();
            }
        });
        Employee e1 = new Employee(108, "Omkar", 24, 3000, "Hyderabad");
        Employee e2 = new Employee(116, "Shekar", 25, 3400, "Banglore");
        Employee e3 = new Employee(107, "Karthik", 25, 3200, "Chennai");
        Employee e4 = new Employee(112, "Naveen", 23, 3000, "Jaipur");
        Employee e5 = new Employee(104, "Rajnikanth", 26, 2900, "Agra");
        Employee e6 = new Employee(136, "Madhuri", 25, 3100, "Hyderabad" );
        Employee e7 = new Employee(110, "Hema", 24, 3300, "Kochin");
        Employee e8 = new Employee(132, "Pavan", 28, 2800, "Kolkatta");

        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        empSet.add(e5);
        empSet.add(e6);
        empSet.add(e7);
        empSet.add(e8);

        for(Employee value: empSet) {
            System.out.println(value.getSalary()+ ":" + value.getName()+":"+ value.getAge());
        }

    }



}