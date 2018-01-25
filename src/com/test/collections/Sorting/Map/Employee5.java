package com.test.collections.Sorting.Map;

public class Employee5 {

    private int id;
    private String name;
    private double salary;
    private String location;
    private String department;
    private boolean hasTakenPromotion;


    public Employee5() {}

    public /**/Employee5(int id, String name, double salary, String location, String department, boolean hasTakenPromotion) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.department = department;
        this.hasTakenPromotion = hasTakenPromotion;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public boolean isHasTakenPromotion() {
        return hasTakenPromotion;
    }
    public void setHasTakenPromotion(boolean hasTakenPromotion) {
        this.hasTakenPromotion = hasTakenPromotion;
    }
}

