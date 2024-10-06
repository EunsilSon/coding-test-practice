class Solution {
    public int[][] solution(int n) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        
        int[][] answer = new int[n][n];
        int count = 1;
        int x = 0;
        int y = 0;
        int direction = 0;
        
        while (count <= n * n) {
            if (x >= 0 && x < n && y >= 0 && y < n && answer[y][x] == 0) {
                answer[y][x] = count++;
            } else {
                x -= dx[direction];
                y -= dy[direction];
                direction = (direction + 1) % 4;
            }
            
            x += dx[direction];
            y += dy[direction];
        }
            
        return answer;
    }
}