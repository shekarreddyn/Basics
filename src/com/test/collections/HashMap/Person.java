package com.test.collections.HashMap;

// 2. Create a HashMap which stores Integer as Key which will be roll number and Person Object as Value. Create 5 entries.

public class Person implements Comparable<Person>{

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(){}

    private String name;
    private int age;
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }
}
