class Solution {
    public static boolean[] visited;
    
    public void dfs(int[][] computers, int i) {
        for (int j = 0; j < computers[i].length; j++) {
            if (computers[i][j] == 1) {
                computers[i][j] = 0;
                dfs(computers, j);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    dfs(computers, i);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}