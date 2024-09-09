import java.util.*;

class Solution {
    public String solution(String polynomial) {
        // +, 공백 제거
        polynomial = polynomial.replace("+", "");
        String[] poly = polynomial.split("\\s+");
        
        Stack<String> stack = new Stack<>();
        boolean isConstant = false;
        int like = 0;

        for (String p : poly) {
            // 상수항
            if (!p.contains("x")) {
                stack.add(p);
                continue;
            }
            
            // 동류항
            isConstant = true;
            if (p.length() == 1) {
                like++;
            } else { 
                String[] temp = p.split("x");
                like += Integer.parseInt(temp[0]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (isConstant) {
            if (like > 1) {
                sb.append(String.valueOf(like));
            }
            sb.append("x");
            
            if (!stack.isEmpty()) { // 상수항 + 동류항
                sb.append(" + ");
            }
        } 
        
        // 상수항 합계
        int constant = 0;
        for (String s : stack) {
            constant += Integer.parseInt(s);
        }

        if (!stack.isEmpty()) {
            sb.append(constant);
        }

        return sb.toString();
    }
}