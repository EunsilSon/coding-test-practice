class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = {"3", "6", "9"};
        
        String orderStr = String.valueOf(order);
        
        for (int i = 0; i < 3; i++) {
            answer += orderStr.length() - orderStr.replaceAll(arr[i], "").length();
        }
        
        return answer;
    }
}