import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        // 점수 합계
        ArrayList<Integer> list = new ArrayList<>();
        int[] total = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int sum = score[i][0] + score[i][1];
            total[i] = sum;
            
            if (!list.contains(sum)) {
                list.add(sum);
            }
        }
        
        // 등수
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        int[] answer = new int[total.length];
        int count = 0;
        int rank = 1;
        
        for (int i = arr.length-1; i >= 0; i--) {
            count = 0;
            
            for (int j = 0; j < total.length; j++) {
                if (total[j] == arr[i]) {
                    answer[j] = rank;
                    count++;
                }
            }
            rank += (count > 1) ? count : 1;
        }
        return answer;
    }
}