import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if (!A.equals(B)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A);
            
            for (int i = 0; i < A.length(); i++) {
                if (!sb.toString().equals(B)){
                    sb.insert(0, sb.charAt(sb.length()-1));
                    sb.deleteCharAt(sb.length()-1);
                    answer++;
                } else {
                    break;
                }
            }
        } 
        
        return answer == A.length() ? -1 : answer;
    }
}