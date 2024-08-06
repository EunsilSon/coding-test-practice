import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        
        int i = 2;
        while (n >= i) {
            if (n % i == 0) {
                n /= i;
                set.add(i);
            } else {
                i++;
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}