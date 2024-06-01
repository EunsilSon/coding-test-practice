import java.util.*;

class Solution {
    static Set<Integer> set = new TreeSet<>();
    static StringBuilder sb = new StringBuilder();
    
    /*
    만들 수 있는 모든 정수를 순열로 만들기
    */
    public static void permutation(int depth, int pick, boolean[] visited, String[] numberArr, String[] output) {
        if (depth == pick) {
            for (int i = 0; i < pick; i++) {
                sb.append(output[i]);
            }
            set.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
            return;
        }

        for (int i = 0; i < numberArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = numberArr[i];
                permutation(depth + 1, pick, visited, numberArr, output);
                visited[i] = false;
            }
        }
    }

    /*
    소수 판별
    */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int solution(String numbers) {
        String[] numberArr = numbers.split("");

        String[] output = new String[numberArr.length];
        boolean[] visited = new boolean[numberArr.length];

        for (int i = 0; i < numberArr.length; i++) {
            permutation(0, i+1, visited, numberArr, output);
        }

        int answer = 0;
        for (int n : set) {
            if (isPrime(n)) {
                answer++;
            }
        }
        return answer;
    }
}