class Solution {
    private static void dfs(int x, int[][] computers) {
        for (int y = 0; y < computers[x].length; y++) {
            if (computers[x][y] == 1) {
                computers[x][y] = 0;
                dfs(y, computers);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] != 0) {
                    count++;
                    dfs(i, computers);
                }
            }
        }
        
        return count;
    }
}