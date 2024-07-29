import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                
                if (i != j && emergency[i] > emergency[j]) { // 다른 숫자
                    answer[j]++;
                    continue;
                }
                
                if (emergency[i] == emergency[j] && i < j) { // 같은 숫자
                    answer[j]++;
                }
                
            }
        }
        
        return answer;
    }
}