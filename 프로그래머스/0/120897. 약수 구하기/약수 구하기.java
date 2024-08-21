import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int mid = n / 2;
        
        for (int i = 1; i <= mid; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);
        
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}