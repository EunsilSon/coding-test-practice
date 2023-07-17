import java.util.*;

class Solution {
    public Object[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }


        for (int i = 0; i < callings.length; i++) {
            int winnerRank = map.get(callings[i]);
            String loser = players[winnerRank-1];

            map.put(players[winnerRank-1], winnerRank);
            map.put(players[winnerRank], winnerRank-1);

            players[winnerRank-1] = callings[i];
            players[winnerRank] = loser;
        }

        return players;
    }
}