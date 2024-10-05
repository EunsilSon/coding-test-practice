import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        int start = 0;
        int end = 0;
        int plus = 1;
        
        switch(n) {
            case 1:
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                end = num_list.length-1;
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                plus = slicer[2];
                break;
        }
        
        for (int i = start; i <= end; i+=plus) {
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}