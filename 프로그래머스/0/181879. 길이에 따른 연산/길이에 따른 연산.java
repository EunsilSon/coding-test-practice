class Solution {
    public int solution(int[] num_list) {
        int answer;
        int i = 0;
        
        if (num_list.length >= 11) {
            answer = 0;
            while (i < num_list.length) {
                answer += num_list[i++];
            }
        } else {
            answer = 1;
            while (i < num_list.length) {
                answer *= num_list[i++];
            }
        }
        
        return answer;
    }
}