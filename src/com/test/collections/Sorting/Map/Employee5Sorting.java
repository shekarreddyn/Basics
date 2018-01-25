/*
package com.test.collections.Sorting.Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//id, name, salary, location, department, promotion
public class Employee5Sorting {

    public static void main(String[] args) {

        Map<Employee5, String> empMap = new HashMap<Employee5, String>();

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

        empMap.put(e1, "CST");
        empMap.put(e2, "CST");
        empMap.put(e3, "EST");
        empMap.put(e4, "EST");
        empMap.put(e5, "CST");
        empMap.put(e6, "EST");
        empMap.put(e7, "EST");
        empMap.put(e8, "PST");
        empMap.put(e9, "CST");
        empMap.put(e10, "EST");

	//1) find out the employees who got promotion and whose salary more than 5000 and
	//sort them based on salary in descending order

	Set<Double> set = new HashSet<Double>(new Comparator<Double>() {

	public double compare(Employee5 o1, Employee5 o2) {

		return o1.getSalary() - o2.getSalary();
	}
});

	Employee5Comparator comparator = new Employee5Comparator();

	Set set = new HashSet();

	Collections.sort(set, comparator);

	Set<Employee5> entries  = empMap.keySet();
	for(Employee5 entry:entries) {
		if(entry.isHasTakenPromotion()==true) {
			if(entry.getSalary()>5000) {
			//	set.add(entry.getSalary());
			}
		}

	}
	//System.out.println(set);

	// Sort based on salary using entryset
	//Set<Integer> salarySet = new TreeSet<Integer>();

	Set<Double> sortingSet = new HashSet<Double>();
	Set<Map.Entry<Employee5, String>> groupEntries = empMap.entrySet();
	for(Map.Entry<Employee5, String> entry:groupEntries) {
          sortingSet.add( ((Employee5) empMap).getSalary());
	}
	System.out.println(sortingSet);


        //3) Sort the employees who has taken promotion on salary based in descending order

        Set<double> promotionSet = new HashSet<double>();
        Set<Map.Entry<Employee5, String>> promotionEntries = empMap.entrySet();
        for(Map.Entry<Employee5, String> promotionEntry : promotionEntries) {}
        //System.out.println(promotionEntry.get());
    }
}*/
