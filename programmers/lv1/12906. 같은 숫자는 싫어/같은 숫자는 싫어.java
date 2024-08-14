import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}