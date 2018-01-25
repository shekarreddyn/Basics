package com.test.collections.Sorting.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//id, name, salary, location, department, promotion
public class Employee5Sorting {

    public static void main(String[] args){

        List<Employee5> empList = new ArrayList<Employee5>();

        Employee5 e1 = new Employee5(106, "Karthik", 4800, "Dallas", "Production", false);
        Employee5 e2 = new Employee5(116, "Shekar", 5000, "Minneapolis", "IT", false);
        Employee5 e3 = new Employee5(132, "Hema", 6000, "Detroit", "IT", true);
        Employee5 e4 = new Employee5(119, "Anusha", 6000, "Miami", "HRM", true);
        Employee5 e5 = new Employee5(121, "Sumanth", 5500, "Chicago", "Administration", true);
        Employee5 e6 = new Employee5(104, "Madhuri", 4200, "New York", "IT", true);
        Employee5 e7 = new Employee5(136, "Srikar", 3800, "WAshington", "Production", true);
        Employee5 e8 = new Employee5(149, "Ravi", 6000, "California", "IT", true);
        Employee5 e9 = new Employee5(163, "Omkar", 4963, "Missouri", "Production", true);
        Employee5 e10 = new Employee5(178, "Naveen", 5896, "Montana", "Production", true);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e10);

        // 1) find out the employees who got promotion and whose salary more than 5000
        // and
        // sort them based on salary
        EmployeeComparator ec = new EmployeeComparator();
        List<Employee5> promotionList = new ArrayList<Employee5>();
        for (Employee5 employee : empList) {

            if (employee.isHasTakenPromotion() == true) {
                if (employee.getSalary() > 5000) {
                    promotionList.add(employee);
                }
            }
        }
        System.out.println("The list before sorting");
        /*System.out.println(promotionList);*/

        Collections.sort(promotionList, new Comparator<Employee5>() {
            public int compare(Employee5 o1, Employee5 o2) {
                return (int) (o2.getSalary() - o1.getSalary());

            }
        });
        for (Employee5 emp : promotionList) {
            System.out.println(emp.getName()+":"+ emp.getSalary());
        }
        // sort all employees based on salary

        Collections.sort(empList, new Comparator<Employee5>() {

            @Override
            public int compare(Employee5 o1, Employee5 o2) {

                return (int) (o2.getSalary() - o1.getSalary());
            }
        });

        System.out.println("Sorted the liist based on the salary");
        for (Employee5 e : empList) {
            System.out.println(e.getName() + " : " + e.getSalary());
        }

        // 3) Sort the employees who has taken promotion on salary based in descending
        // order
        List<Employee5> list = new ArrayList<Employee5> ();
        for (Employee5 emp : empList) {
            if (emp.isHasTakenPromotion() == true) {
                list.add(emp);
            }
        }

        Collections.sort(list, new Comparator<Employee5>() {

            @Override
            public int compare(Employee5 o1, Employee5 o2) {

                return (int) (o2.getSalary() - o1.getSalary());
            }
        });

		/*
		 * for(Employee promList:list) { System.out.println(promList.getName()+":"+
		 * promList.getSalary()); }
		 */

        // 4)for who has not taken promotion sort them based on location
        List locationList = new ArrayList();
        for (Employee5 empl : empList) {
            if (empl.isHasTakenPromotion() == false) {
                locationList.add(empl.getName());
            }
        }
        Collections.sort(locationList, new Comparator<Employee5>() {

            @Override
            public int compare(Employee5 o1, Employee5 o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });

		/*for (Employee5 employ : locationList) {
			System.out.println(employ.getLocation() + ":" + employ.getLocation());
		}*/
    }
}





