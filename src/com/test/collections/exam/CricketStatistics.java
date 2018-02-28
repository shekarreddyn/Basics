package com.test.collections.exam;


import java.util.*;

public class CricketStatistics {

    public static void main(String[] args) {

        List<Cricket> cricketStats = new ArrayList<Cricket>();

        Cricket c1 = new Cricket(8500, 168, "Watson", "Australia", 0);
        Cricket c2 = new Cricket(10000, 212, "Sachin", "India", 1);
        Cricket c3 = new Cricket(6500, 261, "Rohith", "India", 3);
        Cricket c4 = new Cricket(8500, 219, "Sehwag", "India", 1);
        Cricket c5 = new Cricket(8500, 215, "Gayle", "West Indies", 1);
        Cricket c6 = new Cricket(8500, 158, "AB Devilliers", "South Africa", 0);
        Cricket c7 = new Cricket(6834, 191, "Afridi", "Pakistan", 4);
        Cricket c8 = new Cricket(8942, 193, "Jayasurya", "Srilanka", 0);
        Cricket c9 = new Cricket(7342, 171, "Peterson", "England", 5);
        Cricket c10 = new Cricket(4598, 208, "Guptil", "New Zealand", 1);

        cricketStats.add(c1);
        cricketStats.add(c2);
        cricketStats.add(c3);
        cricketStats.add(c4);
        cricketStats.add(c5);
        cricketStats.add(c6);
        cricketStats.add(c7);
        cricketStats.add(c8);
        cricketStats.add(c9);
        cricketStats.add(c10);

//	  1) find out the batsman who has taken 100 wickets and also scored double century


        for (Cricket statistics : cricketStats) {
            if (statistics.getTotalWickets() > 100) {
                if (statistics.getNumberOfDoubleCenturies() > 0) {
                    System.out.println(statistics.getPlayerName() + " : " + statistics.getTotalWickets() + " : " + statistics.getNumberOfDoubleCenturies());
                }
            }

        }



       //  2) find out the batsman from India who has total odi runs more than 5000

        System.out.println("batsman from India who has total odi runs more than 5000");
        for(Cricket statistics: cricketStats){
            if(statistics.getCountryName() == "India"){
                if(statistics.getTotalRuns()>5000){
                    System.out.println(statistics.getPlayerName());
                }
            }
        }


        // bowler with max wickets
        int maxWickets = 0;
        String bowlerWithMaxWickets = null;

        for (Cricket statistics : cricketStats) {

            if(statistics.getTotalWickets() > maxWickets){
                maxWickets= statistics.getTotalWickets();
                bowlerWithMaxWickets = statistics.getPlayerName();
            }

        }
        System.out.println("The bowler with max wickets is " + bowlerWithMaxWickets +" The maximum wickets are " + maxWickets);



        CricketComparator cc = new CricketComparator();

        Collections.sort(cricketStats, cc );
        int  size = cricketStats.size();

        System.out.println(cricketStats.get(size - 1).getPlayerName());

        // sum of runs scored by indian players

        int totalRuns = 0;
        for (Cricket statistics : cricketStats) {

            if(statistics.getCountryName() == "India"){
                totalRuns = totalRuns + statistics.getTotalRuns();
            }

        }
        System.out.println("Runs scored by Indian players" + totalRuns);



        // print players who scored double 1 and 3

        for (Cricket statistics : cricketStats) {
            if(statistics.getNumberOfDoubleCenturies() >=1 && statistics.getNumberOfDoubleCenturies() <=3){
                System.out.println(statistics.getPlayerName()+": " +statistics.getNumberOfDoubleCenturies());
            }
        }

    }
}


