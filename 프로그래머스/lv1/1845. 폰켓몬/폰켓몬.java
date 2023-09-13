import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        
        int answer = (set.size() > (nums.length / 2)) ? nums.length / 2 : set.size();
        
        return answer;
    }
}