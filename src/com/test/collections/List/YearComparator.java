package com.test.collections.List;

import java.util.Comparator;

public class YearComparator implements Comparator<Company> {

    public int compare(Company c1, Company c2 ){

        return c2.getEstablishedYear() - c1.getEstablishedYear();
    }
}
