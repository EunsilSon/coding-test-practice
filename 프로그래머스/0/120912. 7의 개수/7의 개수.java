class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int n : array) {
            String s = String.valueOf(n);
            answer += s.length() - s.replace("7", "").length();
        }
        
        return answer;
    }
}