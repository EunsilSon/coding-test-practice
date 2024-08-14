import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];

        // 점수, 보너스, 옵션 분리
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+|\\D");
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        int j = -1;
        String prevChar = "";

        for (String token : tokens) {

            /*
            점수
             */
            if (token.matches("\\d+")) {
                score[++j] = Integer.parseInt(token);
                continue;
            }

            /*
            보너스와 옵션
             */
            switch (token) {
                case "S":
                    score[j] = (int) Math.pow(score[j], 1);
                    break;
                case "D":
                    score[j] = (int) Math.pow(score[j], 2);
                    break;
                case "T":
                    score[j] = (int) Math.pow(score[j], 3);
                    break;
                case "*":
                    if (j > 0) {
                        score[j-1] *= 2;
                    }
                    score[j] *= 2;
                    break;
                case "#":
                    score[j] *= -1;
                    break;
            }
        }

        /*
        결과
         */
        int answer = 0;
        for (int n : score) {
            answer += n;
        }
        return answer;
    }
}