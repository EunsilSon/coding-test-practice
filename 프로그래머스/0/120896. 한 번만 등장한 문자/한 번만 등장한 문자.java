import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String original = s;
    
        for (int i = 0; i < original.length(); i++) {
            String temp = String.valueOf(original.charAt(i));
            
            if ((s.length() - s.replace(temp, "").length()) >= 2) {
                s = s.replace(temp, "");
            }
        }
        
        return Arrays.stream(s.split(""))
                     .sorted()
                     .collect(Collectors.joining());
    }
}