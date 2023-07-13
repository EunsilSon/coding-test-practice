class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        /*
          최대공약수
         */
        for (int i = Math.min(n, m); i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }

        /*
          최소공배수
        */
         for (int i = 2; i < 1000000; i++) {
             if (i % n == 0 && i % m == 0) {
                 answer[1] = i;
                 break;
             }
         }
        
        
        return answer;
    }
}