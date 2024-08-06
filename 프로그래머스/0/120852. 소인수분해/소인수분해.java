import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 2;
        while (n >= i) {
            if (n % i == 0) {
                n /= i;
                
                if (!list.contains(i)) {
                    list.add(i);
                }
            
            } else {
                i++;
            }
        }
        
        
        int[] answer;
        
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = n;
        } else {
            answer = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }
        }
        
        return answer;
    }
}