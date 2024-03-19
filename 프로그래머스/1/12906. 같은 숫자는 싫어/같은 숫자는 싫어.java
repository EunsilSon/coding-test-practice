import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int []arr) {
        /*
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);

        int[] answer = new int[list.size()];
        int i = 0;
        for (int num : list) {
            answer[i++] = num;
        }

        return answer;
        */
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (!stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        int i = stack.size();
        while (!stack.isEmpty()) {
            answer[--i] = stack.pop();
        }
        
        return answer;
    }
}
