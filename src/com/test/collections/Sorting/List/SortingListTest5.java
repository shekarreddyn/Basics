package com.test.collections.Sorting.List;

import java.util.*;
import java.util.ArrayList;

public class SortingListTest5 {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<Float>();
        floatList.add(3.4f);
        floatList.add(2.3f);
        floatList.add(0.8f);
        floatList.add(1.2f);
        floatList.add(2.8f);
        SortingListTest5 test = new SortingListTest5();
        List<Float> sortedList = test.sortingFloat(floatList);
        for (Float floatValue:sortedList) {
            System.out.println(floatValue);
        }
    }

    public List<Float> sortingFloat(List<Float> list){
        if(null!=list && !list.isEmpty()){
            Collections.sort(list);
        }
        return list;
    }
}
