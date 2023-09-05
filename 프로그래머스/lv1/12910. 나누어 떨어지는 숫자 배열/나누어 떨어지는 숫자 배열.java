import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        int[] result;
        
        if (list.isEmpty()) {
            result = new int[]{ -1 };
            return result;
        } 
        
        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        Arrays.sort(result);
        
        return result;
    }
}