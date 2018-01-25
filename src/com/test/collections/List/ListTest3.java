package com.test.collections.List;

/*1. Create a Set of Integer values. store 10 values inside.
        create a Map<Integer, String> have 10 entries inside map.
        now, the set against map
        for example :  uh have Set <1,2,3,4,5,6,7,8,9,10>
        and uh have one of the map entry like key : 5 and value : "shekar"
        so you got map entry for one of the set value.

        1.1 so check for all the set values whether this map is having a matching value or not.
        1.2 for non matching keys, put them in a seperate list. in the last print all those list values*/

import javax.swing.*;
import java.util.*;

public class ListTest3 {
    public static void main(String[] args) {
        Set<Integer> listSet = new HashSet<Integer>();
        for (int i = 1; i <= 10; i++) {
            listSet.add(i);
        }

        Map<Integer, String> listMap = new HashMap<Integer, String>();
        listMap.put(11, "Dallas");
        listMap.put(12, "Austin");
        listMap.put(13, "SanAntonio");
        listMap.put(14, "Minneapolis");
        listMap.put(5, "Detroit");
        listMap.put(16, "Florida");
        listMap.put(17, "LittleRock");
        listMap.put(18, "Washington");
        listMap.put(3, "Nashville");
        listMap.put(20, "NewYork");

        List<Integer> integerList = new ArrayList<Integer>();
        for (Integer intKey : listSet) {

          boolean isValuePresent =  listMap.containsKey(intKey);
            if(isValuePresent ){

                System.out.println(intKey+":"+listMap.get(intKey));
            }
            else{
               integerList.add(intKey);
            }
        }
        for(Integer intKeys:integerList){
        System.out.println(intKeys);
    }
    }
}



