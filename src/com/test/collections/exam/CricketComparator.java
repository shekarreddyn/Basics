package com.test.collections.exam;

import java.util.Comparator;

public  class CricketComparator implements Comparator<Cricket> {


    @Override
    public int compare(Cricket o1, Cricket o2) {
        return o1.getTotalWickets() - o2.getTotalWickets();
    }

}
