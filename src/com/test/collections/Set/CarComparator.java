package com.test.collections.Set;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {


    public int compare(Car o1, Car o2){

        return o2.getMakeYear() - o1.getMakeYear();
    }
}

