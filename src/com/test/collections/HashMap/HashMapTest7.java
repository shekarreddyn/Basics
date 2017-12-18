package com.test.collections.HashMap;


import com.test.collections.HashMap.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest7 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Shekar", 24, 3500, "IT", "married", 4, false);
        Employee e2 = new Employee("Sumanth", 26, 6000, "IT", "notMarried", 4, false);
        Employee e3 = new Employee("Hema", 23, 3200, "production", "married", 5, true);
        Employee e4 = new Employee("Sunil", 29, 7500, "R&D", "married", 5, true);
        Employee e5 = new Employee("Srikanth", 25, 3700, "IT", "notMarried", 4, false);
        Employee e6 = new Employee("Alissa", 18, 3000, "Marketing", "notMarried", 5, true);
        Employee e7 = new Employee("Madhuri", 24, 4000, "IT", "married", 5, false);
        Employee e8 = new Employee("Omkar", 25, 3800, "Accounts and Finance", "notMarried", 5, true);
        Employee e9 = new Employee("Sumanth", 23, 3200, "HRM", "married", 5, true);
        Employee e10 = new Employee("Naveen", 27, 3800, "IT", "married", 4, true);

        int salary = 0;
        String personWithMaxSalary = null;
        int fiveStarRating = 0;
        int r = 5;
        int avgSalary = 0;
        int promotionCount = 0;
        int count = 0;
        int marriedEmployeeCount = 0;
        int unMarriedEMployeeCount = 0;
        int itDeptEmpCount = 0;
        int nonITDeptEmpCount = 0;
        String names = null;


        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(1001, e1);
        map.put(1002, e2);
        map.put(1003, e3);
        map.put(1004, e4);
        map.put(1005, e5);
        map.put(1006, e6);
        map.put(1007, e7);
        map.put(1008, e8);
        map.put(1009, e9);
        map.put(10010, e10);

        Set<Integer> keySet = map.keySet();
        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            System.out.println(keys + " " + e.getName());

        }

        // 1) Find out employees with same Names if any

        for (Integer key : keySet) {
            Employee e = map.get(key);
            names = e.getName();

            if (names == e.getName()) {
                names = e.getName();
            }
        }
        System.out.println("1) The employee with the same name is "+ ":"+names);
        // 2. Employee with the highest salary

        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (salary < e.getSalary()) {
                salary = e.getSalary();
                personWithMaxSalary = e.getName();
            }
        }

        System.out.println("2) The person with max salary is" + " : " + personWithMaxSalary);

        // 3. No of Employee working in IT department and No of Employees working in
        // others
        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (e.getDepartment() == "IT") {
                itDeptEmpCount = itDeptEmpCount + 1;
            } else {
                nonITDeptEmpCount = nonITDeptEmpCount + 1;
            }
        }

        System.out.println("3) Number of people who are working in IT department is " + ":" + itDeptEmpCount);
        System.out.println("3) Number of people who are working in non IT department is " + ":" + nonITDeptEmpCount);

        // 4. No of Single Employees And No of Married Employees
        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (e.getMaritalStatus() == "married") {
                marriedEmployeeCount = marriedEmployeeCount + 1;
            } else {
                unMarriedEMployeeCount = unMarriedEMployeeCount + 1;
            }
        }
        System.out.println("4) No of employees who are not married is " + " : " + unMarriedEMployeeCount);
        System.out.println("4) No of employees who are married" + " : " + marriedEmployeeCount);

        // 5. Number of Employees with 5 star rating

        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (r == e.getEmployeeRating()) {
                fiveStarRating = fiveStarRating + 1;

            }

        }

        System.out.println("5) The number of employees with the Five Star rating is" + " : " + fiveStarRating);

        // 6. Number of Employees who has taken promotion
        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (e.isPromotionTaken() == true) {
                count = count + 1;
            }

        }
        System.out.println("6) Number of Employees who has taken promotion is" + " : " + count);

        // 7. Number of Employees who has not taken promotion
        for (Integer keys : keySet) {
            Employee e = map.get(keys);
            if (e.isPromotionTaken() == false) {
                promotionCount = promotionCount + 1;

            }
        }
        System.out.println("7) Number of Employees wo has not taken the promotion is " + " :" + promotionCount);

        // 8. Average Salary of all the employees

        int sumofAllSalary = 0;

        for(Integer key : keySet){

            Employee e = map.get(key);

            sumofAllSalary = sumofAllSalary + e.getSalary();
        }

        int avgSalaryCount = sumofAllSalary / keySet.size();

        System.out.println("8) The average salary of all employees is " + " : " + avgSalaryCount);
    }

}
