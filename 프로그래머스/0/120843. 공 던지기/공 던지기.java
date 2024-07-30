import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        
        Queue<Integer> queue = new LinkedList<>();
        for (int n : numbers) {
            queue.add(n);
        }
        
        
        int count = 0;
        
        while (count != k) {
            count++;
            
            answer = queue.remove(); // 공 던진 사람
            queue.add(answer);
            queue.add(queue.remove());
        }
    
        
        return answer;
    }
}