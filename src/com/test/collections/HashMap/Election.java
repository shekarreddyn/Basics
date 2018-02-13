package com.test.collections.HashMap;

public class Election {


    private String stateName;
    private int margin;

    public Election() {}

    public Election(String stateName, int margin) {
        super();
        this.stateName = stateName;
        this.margin = margin;
    }

    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public int getMargin() {
        return margin;
    }
    public void setMargin(int margin) {
        this.margin = margin;
    }



}


