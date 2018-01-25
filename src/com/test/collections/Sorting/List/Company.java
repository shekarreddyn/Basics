package com.test.collections.Sorting.List;
public class Company {

    private String name;
    private int establishedYear;
    private String location;
    private int totalRevenue;
    private int numberOfEmployees;
    private String continent;

    public Company() {}

    public Company(String name, int establishedYear, String location, int totalRevenue, int numberOfEmployees,
                   String continent) {
        super();
        this.name = name;
        this.establishedYear = establishedYear;
        this.location = location;
        this.totalRevenue = totalRevenue;
        this.numberOfEmployees = numberOfEmployees;
        this.continent = continent;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEstablishedYear() {
        return establishedYear;
    }
    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getTotalRevenue() {
        return totalRevenue;
    }
    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

}

