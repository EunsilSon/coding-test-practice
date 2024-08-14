import java.util.*;

class Solution {
    public static void bfs(int[][] computers, int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        
        while (!q.isEmpty()) {
            x = q.poll();
            
            for (int y = 0; y < computers[x].length; y++) {
                if (computers[x][y] == 1) {
                    computers[x][y] = 0;
                    q.offer(y);
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    bfs(computers, i);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}