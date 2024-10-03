import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int answer = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < answer) {
                    answer = arr[j];
                }
            }
            result[i] = (answer < Integer.MAX_VALUE) ? answer : -1;
        }
        
        return result;
    }
}
