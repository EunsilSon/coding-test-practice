import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        /*
        숫자 개수 파악
         */
        for (String x : X.split("")) {
            xArr[Integer.parseInt(x)]++;
        }

        for (String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }

        /*
        9부터 0까지 존재하는 숫자의 개수 만큼 sb에 붙이기
         */
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            while (xArr[i] > 0 && yArr[i] > 0) {
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }

        /*
        결과 출력
        */
        String answer = sb.toString();
        
        if (answer.isEmpty()) {
            return "-1";
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}