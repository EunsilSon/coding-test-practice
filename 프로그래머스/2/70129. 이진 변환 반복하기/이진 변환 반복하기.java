class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int deleted = 0;
        
        while (!s.equals("1")) {
            deleted += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            count++;
        }
        
        answer[0] = count;
        answer[1] = deleted;
        return answer;
    }
}