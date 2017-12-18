package com.test.collections.HashMap;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Set;

public class HashMapTest5 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Shekar", 2);
        map.put("Marissa", 4);
        map.put("Alissa", 3);
        map.put("Sunil", 1);
        map.put("Rajesh", 2);
        map.put("Sandeep", 5);

        int a = 0;
        String s = null;

        Set keyset =  map.keySet();
        for(Object o : keyset) {
            System.out.println(o +" : " + map.get(o));
        }
        System.out.println("---------------------");


        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());

            // find whose family has the max family members


            if(a < entry.getValue()) {

                a= entry.getValue();
                s= entry.getKey();

            }


        }

        System.out.println(a);
        System.out.println(s);

        // find whose family has minimum numbers





    }

}
