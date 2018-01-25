package com.test.collections.Sorting.List;

import java.util.*;
import java.util.ArrayList;

public class SortingListTest4 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(12.64);
        doubleList.add(28.32);
        doubleList.add(16.54);
        doubleList.add(9.32);
        doubleList.add(5.45);

        SortingListTest4 test = new SortingListTest4();
       List<Double> sortedList =  test.SortingDoubleList(doubleList);
        for (Double sortValue: sortedList) {
            System.out.println(sortValue);
        }
    }

    public List<Double> SortingDoubleList(List<Double> list){
        if(null!=list && !list.isEmpty()){
            Collections.sort(list);
        }

        return list;
    }
}
