import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        String operator = "";
        for (int i = 0; i < str.length; i++) {
            if (operator.isEmpty()) {
                
                if (str[i].equals("+") || str[i].equals("-")) {
                    operator = str[i];
                } else {
                    stack.push(Integer.parseInt(str[i]));
                }
                
            } else {
                
                if (operator.equals("+")) {
                    stack.push(stack.pop() + Integer.parseInt(str[i]));
                } else {
                    stack.push(stack.pop() - Integer.parseInt(str[i]));
                }
                operator = "";
            }
        }
        
        return stack.pop();
    }
}