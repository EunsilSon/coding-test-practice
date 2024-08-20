class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int distance = 100;
        
        for (int i : array) {
            int temp = (int) Math.abs(n-i);
            
            if (distance > temp) {
                distance = temp;
                answer = i;
                continue;
            }
            
            if (distance == temp) {
                distance = temp;
                answer = answer > i ? i : answer;
            }
        }
        
        return answer;
    }
}