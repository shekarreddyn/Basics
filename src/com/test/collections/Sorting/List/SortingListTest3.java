package com.test.collections.Sorting.List;

import java.util.*;
import java.util.ArrayList;

public class SortingListTest3 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Delhi");
        stringList.add("Hyderabad");
        stringList.add("Banglore");
        stringList.add("Jaipur");
        stringList.add("Agra");

        SortingListTest3 sortedList = new SortingListTest3();
        List<String> listSorted = sortedList.sortingList(stringList);
        for (String listValue : listSorted) {
            System.out.println(listValue);

        }

    }

    public List<String> sortingList(List<String> list) {

        if (null != list && !list.isEmpty()) {
            Collections.sort(list);
        }
        return list;
    }

}
