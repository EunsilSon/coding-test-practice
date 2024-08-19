import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for (String value : str) {
            if (value.equals("Z")) {
                answer -= stack.pop();
            } else {
                int n = Integer.parseInt(value);
                stack.push(n);
                answer += n;
            }
        }
        
        return answer;
    }
}