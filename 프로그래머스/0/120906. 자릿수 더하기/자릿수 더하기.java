class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] str = String.valueOf(n).split("");
        for (String s : str) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}