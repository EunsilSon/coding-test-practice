class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if (computers[i][j] == 1) {
                    dfs(computers, i);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public static void dfs(int[][] computers, int x) {
        for (int y = 0; y < computers[x].length; y++) {
            if (computers[x][y] == 1) {
                computers[x][y] = 0;
                dfs(computers, y);
            }
        }
    }
}