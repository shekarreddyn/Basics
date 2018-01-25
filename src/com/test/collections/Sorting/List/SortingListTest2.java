package com.test.collections.Sorting.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListTest2 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Dallas");
        listString.add("Austin");
        listString.add("SanAntonio");
        listString.add("Detroit");
        listString.add("Hopkins");

        SortingListTest2 test2 = new SortingListTest2();
       List<String> sortedList =  test2.sortStringList(listString);
        for (String strValue: sortedList) {
            System.out.println(strValue);

        }
    }

    public List<String> sortStringList(List<String> list){
        if(null != list && !list.isEmpty()){

            Collections.sort(list);
        }

        return list;
    }
}
