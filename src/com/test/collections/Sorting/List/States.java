package com.test.collections.Sorting.List;

public class States {

    private String stateName;
    private String capital;
    private int population;
    private int rank;
    private int noOfBigCities;
    private boolean developed;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public States(){}

    public States(String stateName, String capital, int population, int rank, int noOfBigCities, boolean developed, String country) {
        this.stateName = stateName;
        this.capital = capital;
        this.population = population;
        this.rank = rank;
        this.noOfBigCities = noOfBigCities;
        this.developed = developed;
        this.country = country;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getNoOfBigCities() {
        return noOfBigCities;
    }

    public void setNoOfBigCities(int noOfBigCities) {
        this.noOfBigCities = noOfBigCities;
    }

    public boolean isDeveloped() {
        return developed;
    }

    public void setDeveloped(boolean developed) {
        this.developed = developed;
    }
}
