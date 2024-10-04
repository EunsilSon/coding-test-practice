import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] length = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            length[strArr[i].length()]++;
        }
        
        int answer = 0;
        for (int n : length) {
            answer = Math.max(answer, n);
        }
        return answer;
    }
}