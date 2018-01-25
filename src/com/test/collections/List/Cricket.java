package com.test.collections.List;

public class Cricket{
    private  String name;
    private int runs;
    private String country;
    private int wickets;

    public Cricket(){}

    public Cricket(String name, int runs, String country, int wickets) {
        this.name = name;
        this.runs = runs;
        this.country = country;
        this.wickets = wickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int compareTo(Cricket c){

           return this.wickets -c.getWickets();
    }

}
