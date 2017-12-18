package com.test.collections.HashMap;
        import java.util.*;
//Player : name, team, HasScoredDoubleCentury,
//noOfDoubleCenturies, totalRunsinODI, bestScore, noOfWicketsTaken

public class HashMapTest9 {
    public static void main(String[] args) {

        Player p1 = new Player("Sehwag", "India", true, 1, 8500, 219, 156);
        Player p2 = new Player("ABD", "South Africa", false, 0, 7800, 162, 122);
        Player p3 = new Player("Sachin", "India", true, 1, 11000, 248, 192);
        Player p4 = new Player("Rohith", "India", true, 3, 6000, 264, 0);
        Player p5 = new Player("Ganguly", "India", false, 0, 9200, 183, 206);
        Player p6 = new Player("Martin", "New Zealand", true, 1, 7400, 237, 0);
        Player p7 = new Player("Gayle", "West Indies", true, 1, 6400, 215, 132);
        Player p8 = new Player("Jaysurya", "Sri Lanka", false, 0, 9300, 191, 203);
        Player p9 = new Player("Watson", "Australia", false, 0, 6800, 185, 144);
        Player p10 = new Player("Anwar", "Pakistan", false, 0, 7600, 194, 168);

        int century = 0;
        String playerDoubleCentury = null;
        String playerNames = null;
        String pName = null;
        String allRounder = null;
        int totalRuns = 0;
        String playerWithHighestRuns = null;
        int maxODIRuns = 0;
        int maxODIWickets = 0;

        Map<String, Player> map = new HashMap<String, Player>();
        map.put("Sehwag", p1);
        map.put("ABD", p2);
        map.put("Sachin", p3);
        map.put("Rohith", p4);
        map.put("Ganguly", p5);
        map.put("Martin", p6);
        map.put("Gayle", p7);
        map.put("Jaysurya", p8);
        map.put("Watson", p9);
        map.put("Anwar", p10);

        Set<String> keys = map.keySet();

        List<String> playersWithDoubleCentury = new ArrayList<String>();

        // the players who scored double centuries
        for (String key : keys) {
            Player p = map.get(key);
            if (p.getnoOfDoubleCenturies() > 0) {
                playersWithDoubleCentury.add(p.getName());
            }

        }

        System.out.println("The players who scored double centuries are : ");
        for(String playerName :playersWithDoubleCentury){

            System.out.println(playerName);
        }


        // Who are the players from Indian team who scored double centuries
         List<String> listIndianPlayersWithDoubleCenturies= new ArrayList<String>();
        for (String key : keys) {
            Player p = map.get(key);
            if (p.getTeam() == "India") {
                if (p.isHasScoredDoubleCentury() == true) {
                    listIndianPlayersWithDoubleCenturies.add(p.getName());
                }
            }

        }

        System.out.println("2) Players from India who scored double centuries");
        for (String player : listIndianPlayersWithDoubleCenturies){
            System.out.println(player);

        }

        // Has ABD scored any double centuries ?
        for (String key : keys) {
            Player p = map.get(key);
            if (p.getName() == "ABD") {
                if (p.isHasScoredDoubleCentury() == false) {
                    System.out.println("ABD has not scored double century");
                } else {
                    System.out.println("3) Abd has scored double century");
                }
            }
        }

        // Find out the player who has maximum ODI runs and he has scored double century

        for (String key : keys) {
            Player p = map.get(key);
            if (p.getnoOfDoubleCenturies() > 0) {
                if (totalRuns < p.getTotalRunsInODI()) {
                    totalRuns = p.getTotalRunsInODI();
                    playerWithHighestRuns = p.getName();
                    maxODIRuns= p.getTotalRunsInODI();
                    maxODIWickets=p.getNoOfWicketsTaken();

                }
            }
        }
        System.out.println(
                "4) The players with max ODI runs and who has scored double centuries is " + " : " + playerWithHighestRuns);
        System.out.println("Runs:"+maxODIRuns +" AND " + " Wickets : "+maxODIWickets);


        // 5. FInd out Players who has scored double century and also taken wickets
            List<String> allRounders= new ArrayList<String>();
        for (String key : keys) {
            Player p = map.get(key);
            if (p.isHasScoredDoubleCentury() == true) {
                if (p.getNoOfWicketsTaken() > 0) {
                    allRounders.add(p.getName());
                }
            }
        }
        System.out.println("5) The players who scored double centuries and also taken wickets are " );
        for(String player:allRounders){

            System.out.println( player);

        }

    }

}
