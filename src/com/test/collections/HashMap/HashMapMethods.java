package com.test.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(101, "Dallas");
        hashMap.put(102, "Detroit");
        hashMap.put(103, "NewYork");
        hashMap.put(104, "Hopkins");
        hashMap.put(105, "Dearborn");
        hashMap.put(106, "Austin");

        hashMap.containsKey(103);
        System.out.println(hashMap.get(103));

        System.out.println(hashMap.containsValue("Austin"));
    }
}
