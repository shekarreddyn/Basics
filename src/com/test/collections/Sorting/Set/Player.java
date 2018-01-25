package com.test.collections.Sorting.Set;


//Player : name, team, HasScoredDoubleCentury,
// noOfDoubleCenturies, totalRunsinODI, bestScore, noOfWicketsTaken

public class Player {

    private String name;
    private String team;
    private boolean hasScoredDoubleCentury;
    private int  noOfDoubleCenturies;
    private int totalRunsInODI;
    private int bestScore;
    private int noOfWicketsTaken;

    public Player() {}

    public Player(String name, String team, boolean hasScoredDoubleCentury, int noOfDoubleCenturies, int totalRunsInODI,
                  int bestScore, int noOfWicketsTaken) {
        super();
        this.name = name;
        this.team = team;
        this.hasScoredDoubleCentury = hasScoredDoubleCentury;
        this.noOfDoubleCenturies = noOfDoubleCenturies;
        this.totalRunsInODI = totalRunsInODI;
        this.bestScore = bestScore;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public boolean isHasScoredDoubleCentury() {
        return hasScoredDoubleCentury;
    }
    public void setHasScoredDoubleCentury(boolean hasScoredDoubleCentury) {
        this.hasScoredDoubleCentury = hasScoredDoubleCentury;
    }
    public int getnoOfDoubleCenturies() {
        return noOfDoubleCenturies;
    }
    public void setNoOfDoubleCenturies(int noOfDoubleCenturies) {
        this.noOfDoubleCenturies = noOfDoubleCenturies;
    }
    public int getTotalRunsInODI() {
        return totalRunsInODI;
    }
    public void setTotalRunsInODI(int totalRunsInODI) {
        this.totalRunsInODI = totalRunsInODI;
    }
    public int getBestScore() {
        return bestScore;
    }
    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }
    public int getNoOfWicketsTaken() {
        return noOfWicketsTaken;
    }
    public void setNoOfWicketsTaken(int noOfWicketsTaken) {
        this.noOfWicketsTaken = noOfWicketsTaken;
    }



}