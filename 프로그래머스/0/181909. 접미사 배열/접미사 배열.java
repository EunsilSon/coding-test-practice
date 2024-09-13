import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] result = new String[my_string.length()];
        
        int i = 0;
        while (i < my_string.length()) {
            result[i] = my_string.substring(i, my_string.length());
            i++;
        }
        
        Arrays.sort(result);
        return result;
    }
}