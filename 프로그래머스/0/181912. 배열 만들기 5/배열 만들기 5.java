import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (String str : intStrs) {
            sb.append(str.substring(s, s + l));
            
            int n = Integer.parseInt(sb.toString());
            if (n > k) {
                list.add(n);
            }
            
            sb.setLength(0);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}