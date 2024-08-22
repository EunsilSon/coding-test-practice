class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int idx = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                idx = i;
                num = array[i];
            }
        }
        answer[0] = num;
        answer[1] = idx;
        return answer;
    }
}