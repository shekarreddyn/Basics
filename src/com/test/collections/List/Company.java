package com.test.collections.List;

public class Company implements Comparable<Company> {

    private String name;
    private int establishedYear;
    private String location;
    private int rank;

    public Company() {
    }

    public Company(String name, int establishedYear, String location, int rank) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.location = location;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int compareTo(Company c) {
        return  c.getRank() -this.rank;
    }

 /*   public int compareTo(Company c){
        return this.name.compareTo(c.getName());
    } */


}