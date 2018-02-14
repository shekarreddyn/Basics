package com.test.collections.HashMap;

import com.test.collections.HashMap.Election;
import java.util.*;
import java.util.Map.Entry;

public class ElectionResult {

    public static void main(String[] args) {

        Map<String, Map<String, Election>> electionResult = new HashMap<String, Map<String, Election>>();

        Map<String, Election> trumpStateResult = new HashMap<String, Election>();
	/*
	trumpStateResult.put("Texas", "yes");
	trumpStateResult.put("Minnesota", "No");
	trumpStateResult.put("Alabama", "yes");
	trumpStateResult.put("Tennesse", "yes");
	trumpStateResult.put("Arkansas", "yes");
	trumpStateResult.put("Michigan", "yes");
	trumpStateResult.put("California", "No");
	trumpStateResult.put("Florida", "yes");
	trumpStateResult.put("Mississipi", "yes");
	trumpStateResult.put("Virginia", "No");*/

        Map<String, Election> hillaryStateResult = new HashMap<String, Election>();
/*	hillaryStateResult.put("California", "yes");
	hillaryStateResult.put("New York", "Yes");
	hillaryStateResult.put("Minnesota", "Yes");
	hillaryStateResult.put("Colorado", "Yes");
	hillaryStateResult.put("Indiana ", "No");
	hillaryStateResult.put("Kansas ", "No");
	hillaryStateResult.put("North Dakota ", "No");
	hillaryStateResult.put("South Carolina ", "No");
	hillaryStateResult.put("Washington ", "Yes");
	hillaryStateResult.put("Oregon ", "Yes");*/


/*	electionResult.put("Trump", trumpStateResult);
	electionResult.put("Hillary",hillaryStateResult );

	 // print the states that Trump has won
	System.out.println("The trump won states are ");
	Set <Map.Entry<String, String>> entries= trumpStateResult.entrySet();
	for(Map.Entry<String, String> entry : entries) {
		if(entry.getValue() == "yes") {
			System.out.println( entry.getKey());
		}
	}*/

        Election t1 = new Election("Yes", 1000);
        Election t2 = new Election("No", 400);
        Election t3 = new Election("Yes", 1200);
        Election t4 = new Election("Yes", 900);
        Election t5 = new Election("No", 12);
        Election t6 = new Election("No", 4000);
        Election t7 = new Election("No", 10000);
        Election t8 = new Election("Yes", 800);
        Election t9 = new Election("No", 7000);
        Election t10 = new Election("Yes", 1100);


        trumpStateResult.put("Michigan", t1);
        trumpStateResult.put("Minnesota", t2);
        trumpStateResult.put("South Carolina", t3);
        trumpStateResult.put("North Dakota", t4);
        trumpStateResult.put("Florida", t5);
        trumpStateResult.put("California", t6);
        trumpStateResult.put("Texas", t7);
        trumpStateResult.put("Arkansas", t8);
        trumpStateResult.put("Washington", t9);
        trumpStateResult.put("Alabama", t10);


        Election h1 = new Election("Yes", 1000);
        Election h2 = new Election("No",  600);
        Election h3 = new Election("Yes", 13000);
        Election h4 = new Election("Yes", 612);
        Election h5 = new Election("No", 896);
        Election h6 = new Election("Yes", 4000);
        Election h7 = new Election("No", 1284);
        Election h8 = new Election("No", 3482);
        Election h9 = new Election("No", 1644);
        Election h10 = new Election("Yes", 986);


        hillaryStateResult.put("Nevada", h1);
        hillaryStateResult.put("Georgia", h2);
        hillaryStateResult.put("California", h3);
        hillaryStateResult.put("Connecticut", h4);
        hillaryStateResult.put("New Jersey", h5);
        hillaryStateResult.put("Minnesota", h6);
        hillaryStateResult.put("Mississipi", h7);
        hillaryStateResult.put("Oaklohoma", h8);
        hillaryStateResult.put("Nebraska", h9);
        hillaryStateResult.put("Washington", h10);


        electionResult.put("Trump", trumpStateResult);
        electionResult.put("Hillary", hillaryStateResult);

        // find out the states in which trump own
        System.out.println("The trump own states are");
        Set <Map.Entry<String, Election>> entries= trumpStateResult.entrySet();

        Election election = null;

        for(Map.Entry<String, Election> entry : entries) {

            election = entry.getValue();

            if(election.getResult() == "Yes" ){
                System.out.println(entry.getKey()+ " The margin is "+ election.getMargin());
            }
        }

    }

}
