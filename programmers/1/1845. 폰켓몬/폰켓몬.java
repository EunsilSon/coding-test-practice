import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int max = nums.length / 2;
        return (set.size() >= max) ? max : set.size();
        
    }
}