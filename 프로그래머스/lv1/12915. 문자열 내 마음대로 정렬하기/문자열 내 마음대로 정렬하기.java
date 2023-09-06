import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            String target = strings[i];
            char c = strings[i].charAt(n);
            
            int j;
            for (j = i-1; j >= 0 && strings[j].charAt(n) > c; j--) {
                strings[j+1] = strings[j];
            }
            strings[j+1] = target;
        }

        return strings;
    }
}