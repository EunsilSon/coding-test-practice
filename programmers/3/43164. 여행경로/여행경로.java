import java.util.*;

class Solution {
    static boolean[] visited;
    static List<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        
        visited = new boolean[tickets.length];
        
        dfs(tickets, "ICN", "ICN", 0);
        Collections.sort(list);
        return list.get(0).split(" ");
        
    }
    
    public static void dfs(String[][] tickets, String start, String route, int depth) {
        if (depth == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(start) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], route + tickets[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
}