package com.test.collections.Sorting.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListTest1 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 10000; i > 9500; i--) {
            intList.add(i);
        }

        SortingListTest1 test = new SortingListTest1();
        List<Integer> sortedList = test.sortList(intList);

        System.out.println(sortedList);

    }


    public List<Integer> sortList(List<Integer> integerList){

        if(null != integerList && !integerList.isEmpty()){

            Collections.sort(integerList);
        }

        return integerList;

    }
}
