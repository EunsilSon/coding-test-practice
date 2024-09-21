import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            boolean flag = true;
            
            for (String s : String.valueOf(i).split("")) {
                if (!s.equals("0") && !s.equals("5")) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}