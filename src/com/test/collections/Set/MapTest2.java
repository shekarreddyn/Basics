package com.test.collections.Set;
/*1. Create a map of string, Integer fill 10 entries
        take out unique values
        print some of all unique values
        print average of all unique values*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Hyderabad", 101);
        map.put("Chennai", 109);
        map.put("Banglore", 103);
        map.put("Mumbai", 104);
        map.put("Jaipur", 101);
        map.put("Kerala", 106);
        map.put("Delhi", 103);
        map.put("Pune", 108);
        map.put("Punjab", 102);
        map.put("Bandra", 104);


        Set<Integer> set = new HashSet<Integer>();

      Set<Map.Entry<String, Integer>> entries =  map.entrySet();

      for(Map.Entry<String, Integer> entry : entries){
          System.out.println(entry.getValue());

          set.add(entry.getValue());
      }

        System.out.println(set);

// sum of all unique
        int sum=0;
        int avg =0;

        for(Integer number : set){

            sum= sum+number;
        }
        System.out.println("The sum of all unique numbers is:"+sum);

        avg = sum/ set.size();
        System.out.println("The Average of all numbers is:" + avg);

    }


}
