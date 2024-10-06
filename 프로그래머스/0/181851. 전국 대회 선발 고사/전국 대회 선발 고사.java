import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], attendance[i]);
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        
        int[] result = new int[3];
        int idx = 0;
        int pick = 0;
        
        for (Integer r : keyList) {
            if (map.get(r)) {
                for (int i = 0; i < rank.length; i++) {
                    if (rank[i] == r) {
                        result[idx++] = i;
                        pick++;
                        break;
                    }
                }
            }
            
            if (pick == 3) {
                break;
            }
        }
        
        return (10000 * result[0]) + (100 * result[1]) + result[2];
    }
}