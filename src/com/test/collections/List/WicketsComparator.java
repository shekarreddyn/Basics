package com.test.collections.List;

import java.util.Comparator;

public class WicketsComparator implements Comparator<Cricket> {


    public int compare(Cricket c1, Cricket c2){

        return c1.getWickets() - c2.getWickets();
    }
}
