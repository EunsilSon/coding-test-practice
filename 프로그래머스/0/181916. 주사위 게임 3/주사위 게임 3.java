import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        Arrays.sort(num);
        int answer = 0;
        
        if (num[0] == num[3]) {
            answer = 1111 * a;
        } else if (num[0] == num[1] && num[2] == num[3]) {
            answer = (num[0] + num[3]) * (num[3] - num[0]);
        } else if (num[0] == num[2] || num[1] == num[3]) {
            answer = (int) Math.pow(num[1] * 10 + (num[0] + num[3] - num[1]), 2);
        } else if (num[0] == num[1]) {
            answer = num[2] * num[3];
        } else if (num[1] == num[2]) {
            answer = num[0] * num[3];
        } else if (num[2] == num[3]) {
            answer = num[0] * num[1];
        } else {
            answer = num[0];
        }
        
        return answer;
    }
}
