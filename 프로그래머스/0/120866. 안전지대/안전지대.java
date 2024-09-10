class Solution {
    public int solution(int[][] board) {
        int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
        int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
        int safeZone = 0;
        int bomb = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 1) {
                    bomb++;
                    
                    // 안전지대
                    for (int x = 0; x < 8; x++) {
                        for (int y = 0; y < 8; y++) {
                            int nx = i + dx[x];
                            int ny = j + dy[y];

                            if (nx >= 0 && 0 <= ny && nx < board.length && ny < board[0].length) { // 유효 범위
                                if (board[nx][ny] == 0) {
                                    board[nx][ny] = -1;
                                    safeZone++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return (board.length * board[0].length) - safeZone - bomb;
    }
}