import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }


        for (int i = 0; i < callings.length; i++) {
            int runner = map.get(callings[i]);
            String front = players[runner-1];

            map.put(front, runner);
            map.put(players[runner], runner-1);

            players[runner-1] = callings[i];
            players[runner] = front;
        }

        return players;
    }
}