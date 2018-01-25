package com.test.collections.List;


import javax.swing.*;
import java.util.*;

public class ListTest2 {

    public static void main(String[] args) {

        List<Integer> intList =  new ArrayList<Integer>();

        for(int i =1; i<=10; i++){
            intList.add(i);
        }

        List<String> listString = new ArrayList<String>();
        listString.add("Hyderabad");
        listString.add("Kerala");
        listString.add("Chennai");
        listString.add("Banglore");
        listString.add("Assam");
        listString.add("Delhi");
        listString.add("Mumbai");
        listString.add("Bandra");
        listString.add("Jaipur");
        listString.add("Gujarat");

        Map<Integer, String> map = new HashMap<Integer, String>();

        for(int i =9; i>=0; i--){
            map.put( intList.get(i), listString.get(i));
        }

        Set<Integer> integerKeys=  map.keySet();
        for(Integer key:integerKeys){
            System.out.println("The key is "+key + " The value is "+ map.get(key));
        }
    }

}
