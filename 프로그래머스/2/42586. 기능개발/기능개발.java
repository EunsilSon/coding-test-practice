import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        /*
        개발
         */
        for (int i = 0; i < progresses.length; i++) {
            int left = 100 - progresses[i];
            int deployDay;

            if ((left % speeds[i]) != 0) {
                deployDay = left / speeds[i] + 1;
            } else {
                deployDay = left / speeds[i];
            }

            queue.offer(deployDay);
        }
        
        /*
        배포
         */
        while (!queue.isEmpty()) {
            int top = queue.peek();
            int count = 0;

            while (top >= queue.peek()) {
                queue.poll();
                count++;

                if (queue.size() == 0) {
                    break;
                }
            }

            list.add(count);
        }

        int[] answer = new int[list.size()];
        int i = 0;
        for (int num : list) {
            answer[i++] = num;
        }
        
        return answer;
    }
}