import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        
        int i = 2;
        while (n >= i) {
            if (n % i == 0) {
                n /= i;
                set.add(i);
            } else {
                i++;
            }
        }
        
        int[] answer;
        if (set.isEmpty()) {
            answer = new int[1];
            answer[0] = n;
        } else {
            answer = set.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
        }
        
        return answer;
    }
}