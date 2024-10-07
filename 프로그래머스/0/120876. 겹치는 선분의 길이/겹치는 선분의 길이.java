import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        
        int answer = 0;
        for (int n : map.values()) {
            System.out.println(n);
            if (n > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}