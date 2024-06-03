import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        n -= lost.length; // 체육복 도난당한 학생 제외
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 도난당한 학생이 여벌이 있는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    n++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                } 
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 빌려줄 수 있는 경우
                if (lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    n++;
                    reserve[j] = -1;
                    break;
                }

            }
        }
        return n;
    }
}