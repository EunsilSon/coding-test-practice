import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        
        for (int i = 0; i < number.length(); i++) {
            int n = Character.getNumericValue(number.charAt(i));
            idx = i + 1;
            
            if (stack.isEmpty() || stack.peek() >= n) {
                stack.push(n);
            } else {
                while (!stack.isEmpty() && stack.peek() < n) {
                    stack.pop();
                    k--;
                    
                    if (k == 0) {
                        i = number.length() - 1; // k만큼 제거한 경우 for문을 종료하기 위함
                        break;
                    }
                }
                stack.push(n);
            }
        }
        
        while (k-- > 0) {
            stack.pop();
        }
        
        // 남은 숫자들 
        while (idx < number.length()) {
            stack.push(Character.getNumericValue(number.charAt(idx++)));
        }
    
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}