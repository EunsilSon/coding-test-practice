import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int front = numbers[0] * numbers[1];
        int behind = numbers[numbers.length-2] * numbers[numbers.length-1];
        
        return Math.max(front, behind);
    }
}