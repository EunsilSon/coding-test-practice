import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (list.isEmpty()) {
                list.add(numlist[i]);
            } else {
                int nowD = Math.abs(numlist[i] - n);
                
                int idx = 0;
                while (idx < list.size()) {
                    int prevD = Math.abs(list.get(idx) - n);
                    
                    if (nowD < prevD) {
                        list.add(idx, numlist[i]);
                        break;
                    }
                    
                    if (nowD == prevD) { 
                        if (numlist[i] > list.get(idx)) {
                            list.add(idx, numlist[i]);
                        } else {
                            list.add(idx+1, numlist[i]);
                        }
                        break;
                    }
                    
                    if (idx == list.size()-1) {
                        list.addLast(numlist[i]);
                        break;
                    }
                    
                    idx++;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}