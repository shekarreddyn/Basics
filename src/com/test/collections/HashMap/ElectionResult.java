package com.test.collections.HashMap;

        import java.util.*;
        import java.util.Map.Entry;

public class ElectionResult {

    public static void main(String[] args) {

        Map<String, Map<String, Election>> electionResult = new HashMap<String, Map<String, Election>>();

        Map<String, String> trumpStateResult = new HashMap<String, String>();
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

        Map<String, String> hillaryStateResult = new HashMap<String, String>();
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
        Election t2 = new Election("No", 1000);
        Election t3 = new Election("Yes", 1000);
        Election t4 = new Election("Yes", 1000);
        Election t5 = new Election("Yes", 1000);
        Election t6 = new Election("Yes", 1000);
        Election t7 = new Election("Yes", 1000);
        Election t8 = new Election("Yes", 1000);
        Election t9 = new Election("Yes", 1000);
        Election t10 = new Election("Yes", 1000);


    }

}

