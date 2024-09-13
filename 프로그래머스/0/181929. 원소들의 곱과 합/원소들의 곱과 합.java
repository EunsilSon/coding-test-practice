class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int multiple = 1;
        
        for (int n : num_list) {
            plus += n;
            multiple *= n;
        }
        
        return Math.pow(plus, 2) < multiple ? 0 : 1;
    }
}