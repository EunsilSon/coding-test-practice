class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                    max++;
                    continue;
                }
            
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                }
            }
        }
        answer[0] = max;
        answer[1] = min;
        
        for (int i = 0; i < 2; i ++) {
            switch(answer[i]) {
                case 0:
                case 1:
                    answer[i] = 6;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 6:
                    answer[i] = 1;
                    break;
            }
        }
        
        return answer;
    }
}