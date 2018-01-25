package com.test.collections.List;

import java.util.*;

public class SortingCricket {
    public static void main(String[] args) {
        List<Cricket> listCricket = new ArrayList<Cricket>();

        Cricket c1 = new Cricket("ABD", 8500 , "South Africa" , 0);
        Cricket c2 = new Cricket("Gayle", 7500, " West Indies", 54);
        Cricket c3 = new Cricket("McCullum", 8000, "New Zeland", 22);
        Cricket c4 = new Cricket("Watson", 9000, "Australia", 65);
        Cricket c5 = new Cricket("Rohith", 6500, "India", 34);

        listCricket.add(c1);
        listCricket.add(c2);
        listCricket.add(c3);
        listCricket.add(c4);
        listCricket.add(c5);

        //WicketsComparator wcktComp= new WicketsComparator();

        //NameComparator comp = new NameComparator();

        Collections.sort(listCricket, new Comparator<Cricket>() {
            @Override
            public int compare(Cricket o1, Cricket o2) {
                return o1.getWickets() - o2.getWickets();
            }
        });

        for (Cricket value:listCricket) {
            System.out.println(value.getName()+":"+value.getCountry()+":"+value.getRuns()+":"+value.getWickets());
        }

    }
}
