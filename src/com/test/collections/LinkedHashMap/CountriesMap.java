package com.test.collections.LinkedHashMap;



        import java.util.*;

//develop a map which stores countries with its states each and every state stores cities

// Map<String, Map<String, List<String>>>

public class CountriesMap {

    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> countryMap = new HashMap<String, Map<String, List<String>>>();

        List<String> telanganaCities = new ArrayList<String>();
        telanganaCities.add("Warangal");
        telanganaCities.add("Hyderabad");

        List<String> gujaratCities = new ArrayList<String>();
        gujaratCities.add("Baroda");
        gujaratCities.add("Ahmedabad");

        List<String> maharashtraCities = new ArrayList<String>();
        maharashtraCities.add("Bandra");
        maharashtraCities.add("Pune");

        List<String> texasCities = new ArrayList<String>();
        texasCities.add("Dallas");
        texasCities.add("Austin");

        List<String> minnesotaCities = new ArrayList<String>();
        minnesotaCities.add("Minneapol;is");
        minnesotaCities.add("St.Paul");

        Map<String, List<String>> indiaMap = new HashMap<String, List<String>>();
        indiaMap.put("Telangana", telanganaCities);
        indiaMap.put("Gujarat", gujaratCities);
        indiaMap.put("Maharashtra", maharashtraCities);

        Map<String, List<String>> usaMap = new HashMap<String, List<String>>();
        usaMap.put("Texas", texasCities);
        usaMap.put("Minnesota", minnesotaCities);

        countryMap.put("India", indiaMap);
        countryMap.put("USA", usaMap);

        // print only the country names

        Set<String> countriesSet = countryMap.keySet();
        for (String country : countriesSet) {
            System.out.println(country);
        }

        System.out.println("The states that are present in India");

        // print only the states names

        Set<String> statesMap = indiaMap.keySet();
        for (String state : statesMap) {
            System.out.println(state);
        }

        Set<String> usaMap1 = usaMap.keySet();
        for (String state : usaMap1) {
            System.out.println(state);
        }

        System.out.println("The cities in texas are");
        // print the cities that are present in texas

        List<String> texasCitiesList = usaMap.get("Texas");

        for (String city : texasCitiesList) {
            System.out.println(city);
        }


        System.out.println("The cities tht are present in mahrashtra");
        // print the cities that are present in maharashtra

        List<String> maharashtraCitiesList = indiaMap.get("Maharashtra");

        for (String city : maharashtraCitiesList) {
            System.out.println(city);
        }
    }
}
