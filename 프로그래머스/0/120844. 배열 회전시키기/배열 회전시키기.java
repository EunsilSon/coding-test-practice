import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            deque.addLast(numbers[i]);
        }

        if (direction.equals("right")) {
            deque.addFirst(deque.removeLast());
        } else {
            deque.addLast(deque.removeFirst());
        }

        int[] answer = new int[numbers.length];
        int i = 0;
        for(int num : deque) {
            answer[i++] = num;
        }
        
        return answer;
    }
}