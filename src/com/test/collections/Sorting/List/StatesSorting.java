package com.test.collections.Sorting.List;

import java.util.*;

public class StatesSorting {

    public static void main(String[] args) {

        List<States> statesList = new ArrayList<States>();
        States s1 = new States("Telangana", "Hyderabad", 5, 4, 3, true , "India");
        States s2 = new States("New York", "Albany" , 3, 1, 6, true, "USA");
        States s3 = new States("Arkansas", "little Rock", 1, 9, 1, false, "USA");
        States s4 = new States("Maharashtra", "Munbai", 6, 2, 4, true, "India");
        States s5 = new States("Japan", "Tokyo", 3, 5, 8, true, "Japan");
        States s6 = new States("Karnataka", "Banglore", 2, 6, 2, false, "India");
        States s7 = new States("Washington", "Seattle", 3, 3, 5, true, "North America");
        States s8 = new States("Delhi", "New Delhi", 4, 8, 3, true, "India");

        statesList.add(s1);
        statesList.add(s2);
        statesList.add(s3);
        statesList.add(s4);
        statesList.add(s5);
        statesList.add(s6);
        statesList.add(s7);
        statesList.add(s8);

     /* Collections.sort(statesList, new Comparator<States>() {
          @Override
          public int compare(States o1, States o2) {
              return o1.getRank() - o2.getRank();
          }
      });

        for (States state: statesList) {
            System.out.println(state.getRank()+":"+ state.getStateName());

        }

        System.out.println();

*/
     /*// 3) Separate states with more than 5 milliuon people and which are in India, sort based on rank
      List<States> popularList = new ArrayList<States>();
        for (States  popularState:statesList) {
            if(popularState.getPopulation() >= 5){
                if(popularState.getCountry()=="India"){
                    popularList.add(popularState);
                }
            }
        }

        Collections.sort(popularList, new Comparator<States>() {
            @Override
            public int compare(States o1, States o2) {
                return o1.getRank() - o2.getRank();
            }
        });

        for (States list: popularList) {
            System.out.println(list.getRank()+":"+list.getStateName());
        }*/

        // state = key , value = populatipon

        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (States mapState: statesList) {
            map.put(mapState.getStateName(), mapState.getPopulation());

        }

        Set<Map.Entry<String, Integer>> mapEntries = map.entrySet();

        for (Map.Entry<String, Integer> entry: mapEntries) {
            System.out.println("The state name is "+ ": "+entry.getKey()+":" +" population is : "+entry.getValue());

        }
    }
}
