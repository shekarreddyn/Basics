package com.test.collections.exam;

public class Cricket {

    private int totalRuns;
    private int totalWickets;
    private String playerName;
    private String countryName;
    private int numberOfDoubleCenturies;

    private Cricket(){}

    public Cricket(int totalRuns, int totalWickets, String playerName, String countryName, int numberOfDoubleCenturies) {
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.playerName = playerName;
        this.countryName = countryName;
        this.numberOfDoubleCenturies = numberOfDoubleCenturies;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getNumberOfDoubleCenturies() {
        return numberOfDoubleCenturies;
    }

    public void setNumberOfDoubleCenturies(int numberOfDoubleCenturies) {
        this.numberOfDoubleCenturies = numberOfDoubleCenturies;
    }


}
