import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (long s : scoville) {
            pq.add(s);
        }

        int answer = 0;
        long sco1, sco2;

        if (pq.peek() >= K) {
            return answer;
        }

        while (pq.size() > 1) {
            if (pq.peek() >= K) {
                return answer;
            }

            sco1 = pq.poll();
            sco2 = pq.poll();
            pq.add(sco1 + (sco2 * 2));
            answer++;
        }

        if (pq.peek() >= K) {
            return answer;
        }

        return -1;
    }
}