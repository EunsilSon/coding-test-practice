import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        int[] result = new int[3];
        int idx = 0;
        int pick = 0;
        
        for (Integer key : map.keySet()) {
            result[idx++] = map.get(key);
            pick++;
            
            if (pick == 3) {
                break;
            }
        }
        
        return (10000 * result[0]) + (100 * result[1]) + result[2];
    }
}