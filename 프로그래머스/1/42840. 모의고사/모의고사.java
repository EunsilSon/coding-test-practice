import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];;

        /*
        수포자 별 채점
        */
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % 5]) {
                score[0]++;
            }
            
            if (answers[i] == p2[i % 8]) {
                score[1]++;
            }
            
            if (answers[i] == p3[i % 10]) {
                score[2]++;
            }
            
        }

        /*
        가장 높은 점수 구하기
        */
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        /*
        가장 높은 점수를 받은 수포자만 추출
        */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}