package com.test.collections.Sorting.List;

import java.util.*;

public class IPLSorting   {

    public static void main(String[] args) {
        List<IPLCricket> list = new ArrayList<IPLCricket>();
        IPLCricket ic1 = new IPLCricket("MumbaiIndians", 22000, "Rohith Sharma", 24000);
        IPLCricket ic2 = new IPLCricket("Rajasthan Royals", 30000, "Watson", 32000);
        IPLCricket ic3 = new IPLCricket("Deccan Chargers", 14000, "Gilchrist", 18000);
        IPLCricket ic4 = new IPLCricket("Chennai Super Kings", 36000, "Dhoni", 16000);
        IPLCricket ic5 = new IPLCricket("Royal Challange Banglore", 30000, " AB Devilliers", 30000 );

        list.add(ic1);
        list.add(ic2);
        list.add(ic3);
        list.add(ic4);
        list.add(ic5);

// 1) by using the comparable interface

        /*   Collections.sort(list);
        for (IPLCricket cricket:list) {
            System.out.println(cricket.getAmountPaid());
        }*/

     // 2) by using the comparator

       /* IPLCricketComparator iplc = new IPLCricketComparator();
        Collections.sort(list, iplc);
        for (IPLCricket ipl:list) {
            System.out.println(ipl.getTeamName());*/

            // 3) by using the annonymous comparator

        Collections.sort(list, new Comparator<IPLCricket>() {
            @Override
            public int compare(IPLCricket o1, IPLCricket o2) {
                return o1.getValuablePlayer().compareTo(o2.getValuablePlayer());

            }
        });

        for (IPLCricket ipl:list) {
            System.out.println(ipl.getValuablePlayer());
        }

    }
}
