package com.test.collections.Sorting.Set;


        import java.util.HashMap;
        import java.util.Map;
        import java.util.*;


public class PlayerSorting {


    public static void main(String[] args) {

        //Map<Integer, String> playerMap = new HashMap<Integer, String>();

        Map<String, Player> playerMap = new HashMap<String, Player>();

        Player p1 = new Player("Rohith", "India", true, 3, 6600, 260, 4);
        Player p2 = new Player("Abd", "South Africa", false, 0, 8000, 168, 0);
        Player p3 = new Player("Martin guptil", "New Zeland", true, 1,  6600, 237, 0 );
        Player p4 = new Player("Sehwag", "India", true, 1, 7802, 219 , 58);
        Player p5 = new Player("Gayle", "West Indies", true, 1, 7645, 215, 60);
        Player p6 = new Player("Afridi", "Pakistan", false, 0, 6634, 164, 122);
        Player p7 = new Player("Sachin", "India", true, 1, 11000, 200 , 132);
        Player p8 = new Player("Jayasurya", "Sri Lanka", false, 0 , 8687, 189, 68);
        Player p9 = new Player("Watson", "Australia", false, 0, 7440, 176, 38);
        Player p10 = new Player("Warner", "Australia", false, 0, 6500, 162, 0);

        playerMap.put("Rohith", p1);
        playerMap.put("Abd", p2);
        playerMap.put("Martin", p3);
        playerMap.put("Sehwag", p4);
        playerMap.put("Gayle", p5);
        playerMap.put("Afridi", p6);
        playerMap.put("Sachin", p7);
        playerMap.put("Jayasurya", p8);
        playerMap.put("Watson", p9);
        playerMap.put("Warner", p10);

        int maxRuns = 0;
        String playerNameWithDoubleCentury= null;
        String playerWithHighestRuns = null;
        // 1. From array given above who are the players who scored double centuries

        Set<String> names = playerMap.keySet();

        for(String name:names) {

            // here we are storing all the keys in one variable
            Player p = playerMap.get(name);

            if(p.getnoOfDoubleCenturies() >0) {
                System.out.println(p.getName());
            }
        }

        // 2. Who are the players from Indian team who scored double centuries

        System.out.println(" 2)The players from India who scored double centuries");
        for(String name: names) {
            Player p = playerMap.get(name);
            if(p.getnoOfDoubleCenturies()>0 && p.getTeam() == "India") {
                System.out.println(p.getName()+ ": " + p.getBestScore());
            }
        }

        // 3. Has ABD scored any double centuries ?
        for(String name:names) {

            if("Abd".equals(name)){

                Player p = playerMap.get(name);

                if(p.getnoOfDoubleCenturies()>0) {

                    System.out.println("Abd scored double century");
                }
                else {
                    System.out.println("Abd not scored double century");
                }
            }
        }

        // 4. Find out the player who has maximum ODI runs and he has scored double century
        System.out.println("The plyaer with double century and max runs is ");

        List<Player> playerList = new ArrayList<Player>();
        for(String name : names){
            Player p = playerMap.get(name);
            if(p.getnoOfDoubleCenturies()>0){
                playerList.add(p);
            }
        }
             Collections.sort(playerList, new Comparator<Player>() {
                 @Override
                 public int compare(Player o1, Player o2) {
                     return o2.getTotalRunsInODI() - o1.getTotalRunsInODI();
                 }
             });

        System.out.println(playerList.get(0).getName());

        // 5. FInd out Players who has scored double century and also taken wickets
        System.out.println("The players who scored double centuries and also taken wickets");

        for(String name:names) {
            Player p = playerMap.get(name);
            if(p.getnoOfDoubleCenturies()>0 && p.getNoOfWicketsTaken()>0) {
                System.out.println(p.getName()+":"+p.getNoOfWicketsTaken()+":"+p.getnoOfDoubleCenturies());
            }
        }}
}