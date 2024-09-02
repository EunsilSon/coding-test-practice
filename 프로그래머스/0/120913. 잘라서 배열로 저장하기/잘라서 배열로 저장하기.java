import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            list.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        
        return list.toArray(new String[list.size()]);
    }
}