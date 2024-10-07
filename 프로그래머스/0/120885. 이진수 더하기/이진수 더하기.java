import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        return toBinary(toDecimal(bin1) + toDecimal(bin2));
    }
    
    public static int toDecimal(String n) {
        int result = 0;
        int i = n.length()-1;
        
        for (char c : n.toCharArray()) {
            result += Character.getNumericValue(c) * (int) Math.pow(2, i--);
        }
        return result;
    }
    
    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }
    
}