package com.test.collections.Sorting.List;

public class IPLCricket implements Comparable<IPLCricket>{

    private String teamName;
    private int totalRuns;
    private String valuablePlayer;
    private int amountPaid;

    public IPLCricket(){}

    public IPLCricket(String teamName, int totalRuns, String valuablePlayer, int amountPaid) {
        this.teamName = teamName;
        this.totalRuns = totalRuns;
        this.valuablePlayer = valuablePlayer;
        this.amountPaid = amountPaid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getValuablePlayer() {
        return valuablePlayer;
    }

    public void setValuablePlayer(String valuablePlayer) {
        this.valuablePlayer = valuablePlayer;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }


    @Override
    public int compareTo(IPLCricket ipl) {
        return this.amountPaid - ipl.amountPaid ;
    }
}
