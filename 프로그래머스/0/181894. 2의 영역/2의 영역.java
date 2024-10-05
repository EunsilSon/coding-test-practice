import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int start = 0;
        int end = 0;
        boolean flag = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                flag = true;
                break;
            }
        }
        
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                flag = true;
                break;
            }
        }
        
        for (int i = start; i <= end && flag; i++) {
            list.add(arr[i]);
        }
        
        int[] answer;
        if (list.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
    }
}