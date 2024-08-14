import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        for (String s : cards1) {
            q1.add(s);
        }

        for (String s : cards2) {
            q2.add(s);
        }

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(q1.peek())) { // cards1에서 사용
                q1.poll();
                continue;
            }

            if (goal[i].equals(q2.peek())) { // cards2에서 사용
                q2.poll();
                continue;
            }
            // 둘 다 맞는 게 없음
            return "No";
        }
        return "Yes";
    }
}