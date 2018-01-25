package com.test.collections.Sorting.List;

import java.util.Comparator;

public class IPLCricketComparator implements Comparator<IPLCricket> {


    @Override
    public int compare(IPLCricket o1, IPLCricket o2) {
        return o1.getTeamName().compareTo(o2.getTeamName());
    }

}
