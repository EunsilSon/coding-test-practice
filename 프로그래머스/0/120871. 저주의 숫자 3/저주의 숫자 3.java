import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> xNums = new ArrayList<>();
        
        int i = 1;
        while (xNums.size() != n) {
            if (i % 3 != 0 && !String.valueOf(i).matches("(.*)3(.*)")) {
                xNums.add(i);
            }
            i++;
        }
        
        return xNums.get(n-1);
    }
}