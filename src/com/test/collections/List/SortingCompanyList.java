package com.test.collections.List;

import java.util.*;

public class SortingCompanyList {

    public static void main(String[] args) {
        List<Company> companiesList = new ArrayList<Company>();

        Company c1 = new Company("Mckesson", 1876, "California", 5);
        Company c2 = new Company("Microsoft", 1906, "New York", 3);
        Company c3 = new Company("Amazon", 1930, "California", 2);
        Company c4 = new Company("Wallmart", 1960, "Bentonville", 1);
        Company c5 = new Company("Google", 1904, "Seattle", 4);

        companiesList.add(c1);
        companiesList.add(c2);
        companiesList.add(c3);
        companiesList.add(c4);
        companiesList.add(c5);

        //YearComparator yearComp = new YearComparator();

        Collections.sort(companiesList);

        for (Company value:companiesList) {
            System.out.println(value.getName()+":"+value.getRank()+":"+value.getEstablishedYear()+":"+value.getLocation());
        }
    }
}
