package com.test.collections.HashMap;

public class Election {


    private String result;
    private int margin;

    public Election() {}

    public Election(String result, int margin) {
        super();
        this.result = result;
        this.margin = margin;
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public int getMargin() {
        return margin;
    }
    public void setMargin(int margin) {
        this.margin = margin;
    }



}


