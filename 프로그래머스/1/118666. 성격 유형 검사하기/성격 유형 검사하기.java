import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Character[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}; 
        String[] table = {"RT", "CF", "JM", "AN"};
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};
        
        HashMap<Character, Integer> map = new HashMap<>(); // 유형 별 누적 점수
        for (int i = 0; i < 8; i++) {
            map.put(type[i], 0);
        }
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + score[choices[i]]);
            } 
            
            if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + score[choices[i]]);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            int t1 = map.get(table[i].charAt(0));
            int t2 = map.get(table[i].charAt(1));
            
            if (t1 > t2) {
                result.append(table[i].charAt(0));
            } else if (t1 < t2) {
                result.append(table[i].charAt(1));
            } else {
                String[] temp = table[i].split("");
                Arrays.sort(temp);
                result.append(temp[0]);
            }
        }
        
        return result.toString();
    }
}
