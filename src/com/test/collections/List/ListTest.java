package com.test.collections.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {


    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<Integer>();

        for(int i = 1; i <=1000000; i ++){

            testList.add(i);
        }
        /*for (Integer number:testList) {
            System.out.println(number);
        }*/


        List<String> stringList = new LinkedList<String>();
        stringList.add("jfgvj");
        stringList.add("owedufh");
        stringList.add("posad");
        stringList.add("aldhcoud");
        stringList.add("twrd");
        stringList.add("zesz");
        stringList.add("pokju");
        stringList.add("wwedsvcdd");
        stringList.add("mkjnhb");
        stringList.add("kmkmlj");
        stringList.add("weoihci");
        stringList.add("qw0idouy");


        for(String value : stringList){

            System.out.println(value);
        }




    }



}
