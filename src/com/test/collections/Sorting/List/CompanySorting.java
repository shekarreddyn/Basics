package com.test.collections.Sorting.List;



        import java.util.*;

public class CompanySorting {

    public static void main(String[] args) {

        List<Company> companyList = new ArrayList<Company>();

        Company c1 = new Company("Google", 1904, "California", 58000, 28000, "North America");
        Company c2 = new Company("Amazon", 1936, "New york", 78000, 45000, "North America");
        Company c3 = new Company("Wallmart", 1958, "Arkansas", 48000, 39000, "North America");
        Company c4 = new Company("Toyota", 1968, "Japan", 48000, 36000, "Asia");
        Company c5 = new Company("Honda", 1944, "Japan", 54000, 38000, "Asia");
        Company c6 = new Company("Rolls Royce", 1744, "Italy", 98000, 78000, "Europe");

        companyList.add(c1);
        companyList.add(c2);
        companyList.add(c3);
        companyList.add(c4);
        companyList.add(c5);
        companyList.add(c6);

        // sort the companies based on the established year

        Collections.sort(companyList, new Comparator<Company>() {

            @Override
            public int compare(Company o1, Company o2) {
                return o1.getEstablishedYear() - o2.getEstablishedYear();
            }
        });
        for (Company comp : companyList) {
            System.out.println(comp.getEstablishedYear() + ":" + comp.getName());
        }

        System.out.println();
        // sort based on revenue in descending order
        Collections.sort(companyList, new Comparator<Company>() {

            @Override
            public int compare(Company o1, Company o2) {
                return o2.getTotalRevenue() - o1.getTotalRevenue();
            }
        });
        for (Company comp : companyList) {
            System.out.println(comp.getTotalRevenue() + ":" + comp.getName());
        }

        System.out.println();
        // 3) find the companies in Asia based on revenue

        List<Company> list = new ArrayList<Company>();
        for (Company company : companyList) {
            if (company.getContinent() == "Asia") {
                list.add(company);
            }


        }
        Collections.sort(list, new Comparator<Company>() {

            @Override
            public int compare(Company o1, Company o2) {
                return o2.getTotalRevenue() - o1.getTotalRevenue();
            }

        });

        for (Company asiaCompany : list) {
            System.out.println(asiaCompany.getTotalRevenue() + ":" + asiaCompany.getName());
        }
    }
}

