import java.util.*;

class Solution {
    
    public static int bfs(HashSet<String> set, String begin, String target) {
        Queue<String> queue = new LinkedList<>();
        int conCnt = 0;

        for (String s : set) {
            queue.offer(s);
        }

        while (true) {
            String s = queue.poll();

            int diffChar = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != begin.charAt(i)) {
                    diffChar++;
                }
            }

            if (diffChar == 1) { // 바꿀 수 있는 단어
                begin = s;
                conCnt++;
            } else {
                queue.offer(s);
            }

            if (begin.equals(target)) {
                return conCnt;
            }
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        int result = 0;
        
        HashSet<String> set  = new HashSet<>(Arrays.asList(words));
        // target이 words에 존재하는 지 확인
        if (!set.contains(target)) {
            System.out.println(0);
        } else {
            result = bfs(set, begin, target);
        }
        
        return result;
    }
}