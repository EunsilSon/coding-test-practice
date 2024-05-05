class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int answer = 0;
        
        for (int i = 0; i < 4; i++) {
            int nx = h + dx[i];
            int ny = w + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= board.length || ny >= board.length) {
                continue;
            }
            
            if (board[nx][ny].equals(board[h][w])) {
                answer++;
            }
        }
        
        return answer;
    }
}