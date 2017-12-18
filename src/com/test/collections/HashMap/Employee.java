package com.test.collections.HashMap;


/*
1. Name
2. Age
3. Salary
4. Department
5. Maritial Status
6. employee rating
7. isPromotionTaken*/

public class Employee {

    private String name;
    private int age;
    private int salary;
    private String department;
    private String maritalStatus;
    private int employeeRating;
    private boolean isPromotionTaken;

    public Employee() {}

    public Employee(String name, int age, int salary, String department, String maritalStatus, int employeeRating,
                    boolean isPromotionTaken) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.maritalStatus = maritalStatus;
        this.employeeRating = employeeRating;
        this.isPromotionTaken = isPromotionTaken;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public int getEmployeeRating() {
        return employeeRating;
    }
    public void setEmployeeRating(int employeeRating) {
        this.employeeRating = employeeRating;
    }
    public boolean isPromotionTaken() {
        return isPromotionTaken;
    }
    public void setPromotionTaken(boolean isPromotionTaken) {
        this.isPromotionTaken = isPromotionTaken;
    }


}