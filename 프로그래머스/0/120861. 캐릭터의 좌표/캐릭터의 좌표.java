class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int X = board[0] / 2;
        int Y = board[1] / 2;
        
        int dx = 0;
        int dy = 0;
        
        for (String key : keyinput) {
            dx = answer[0];
            dy = answer[1];
            
            switch(key) {
                case "up":
                    dy++;
                    if (dy <= Y) {
                        answer[1] = dy;
                    }
                    break;
                case "down":
                    dy--;
                    System.out.println(-Y);
                    if (dy >= -Y) {
                        answer[1] = dy;
                    }
                    break;
                case "left":
                    dx--;
                    if (dx >= -X) {
                        answer[0] = dx;
                    }
                    break;
                case "right":
                    dx++;
                    if (dx <= X) {
                        answer[0] = dx;
                    }
                    break;
            }
        }
        
        return answer;
    }
}