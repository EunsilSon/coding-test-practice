import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        int i = 0;
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            if (map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } 
        }
        
        String answer = "";
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer = s;
            }
        }
        
        return answer;
    }
}