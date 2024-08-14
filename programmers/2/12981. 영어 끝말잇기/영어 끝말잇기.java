import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        int[] answer = new int[2];
        int player = 1;
        int count = 1;
        String prev = words[0];
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String s = words[i];
            player++;

            if (set.contains(s) || prev.charAt(prev.length()-1) != s.charAt(0)) {
                answer[0] = player;
                answer[1] = count;
                return answer;
            }

            set.add(s);
            prev = s; // 마지막 문자

            if (player == n) {
                player = 0;
                count++;
            }
        }
        
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}