package com.test.collections.HashMap;

import java.util.*;

//develop a map which stores countries with its states each and every state stores cities


// Map<String, Map<String, List<String>>>

public class CountriesMap {

    public static void main(String[] a ){

        Map<String, Map<String, List<String>>> countryMap = new HashMap<String, Map<String, List<String>>>();
        // countryMap.put("India", "Telangana", "Hyderabad", "warangal" );

        List<String> arizonaCities = new ArrayList<String>();
        arizonaCities.add("Mesa");
        arizonaCities.add("Phoenix");


        List<String> floridaCities = new ArrayList<String>();
        floridaCities.add("Mesa");
        floridaCities.add("Phoenix");


        Map<String, List<String>> usCountryMap = new HashMap<String, List<String>>();
        usCountryMap.put("Arizona", arizonaCities);
        usCountryMap.put("Florida", floridaCities);

        List<String> telanganaCities = new ArrayList<String>();
        telanganaCities.add("Hyderabad");
        telanganaCities.add("Warangal");

        List<String> mumbaiCities = new ArrayList<String>();
        mumbaiCities.add("Bandra");
        mumbaiCities.add("pune");

        List<String> gujarathCities = new ArrayList<String>();
        gujarathCities.add("Ahmedabad");
        gujarathCities.add("Surat");


        Map<String,List<String>> indiaMap = new HashMap<String,List<String>>();
        indiaMap.put("Telangana", telanganaCities);
        indiaMap.put("Maharashtra", mumbaiCities);
        indiaMap.put("Gujarat", gujarathCities);

        countryMap.put("US", usCountryMap);
        countryMap.put("India", indiaMap);


        Set<String> countrySet =  countryMap.keySet();
        for (String countryName: countrySet) {
            System.out.println(countryName);
        }


        Map<String,List<String>> indianMap =  countryMap.get("India");

        Set<String> stateKeys = indiaMap.keySet();

        for(String stateName : stateKeys){

            System.out.println(stateName);
        }

        List<String> citiesList = indianMap.get("Gujarat");

        for (String city:citiesList) {
            System.out.println(city);
        }

    }

	    /*cities.add(new City('Mesa','Arizona','US'));

	    cities.add(new City('Phoenix','Arizona','US'));

	    cities.add(new City('Miami','Florida','US'));

	    cities.add(new City('Patna','Bihar','IN'));

	    cities.add(new City('Samastipur','Bihar','IN'));

	    cities.add(new City('Brisbane','Queensland','AU'));

	    cities.add(new City('Caboolture','Queensland','AU'));

	    cities.add(new City('Airdrie','Alberta','CA'));

	    cities.add(new City('Camrose','Alberta','CA'));*/

}
