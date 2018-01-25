package com.test.collections.List;

public class Employee implements Comparable<Employee> {

    private String name;
    private int id;
    private String department;
    private int age;

    public Employee(){}

    public Employee(String name, int id, String department, int age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

// this is to compare based on ages
/*    @Override
    public int compareTo(Employee e) {

        return this.age- e.getAge();
    }*/

// this is to compare based on ages
    public int compareTo(Employee e){
        return this.name.compareTo(e.getName());
    }


}
