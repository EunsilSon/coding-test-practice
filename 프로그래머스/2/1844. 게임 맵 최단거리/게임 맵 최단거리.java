import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;
        visited[maps.length-1][maps[0].length-1] = -1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        
        while (!queue.isEmpty()) {
            int[] node = queue.remove();
            int x = node[0];
            int y = node[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && visited[nx][ny] <= 0) {
                        visited[nx][ny] = visited[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }   
        }
        return visited[maps.length-1][maps[0].length-1];
    }
}