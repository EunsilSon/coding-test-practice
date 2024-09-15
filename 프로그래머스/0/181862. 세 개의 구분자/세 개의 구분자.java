import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]", -1);
        
        List<String> list = new ArrayList<>();
        for (String s : str) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        String[] answer;
        if (list.isEmpty()) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = list.stream().toArray(String[]::new);
        }
        
        return answer;
    }
}