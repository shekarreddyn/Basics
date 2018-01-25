package com.test.collections.List;

public class Person implements Comparable<Person>{

    private String name;
    private String city;
    private int age;
    private String gender;

    public Person(){}

    public Person(String name, String city, int age, String gender) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}
