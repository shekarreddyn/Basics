package com.test.collections.List;

import java.util.Comparator;

public class NameComparator implements Comparator<Cricket>{

    public int compare(Cricket c1, Cricket c2){

        return c1.getName().compareTo(c2.getName());
    }
}
