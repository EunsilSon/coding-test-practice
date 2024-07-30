import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        
        Queue<Integer> queue = new LinkedList<>();
        for (int n : numbers) {
            queue.add(n);
        }
        
        int count = 1;
        while (count != k) {
            queue.add(queue.remove());
            queue.add(queue.remove());
            count++;
        }
        
        return queue.remove();
        
    }
}