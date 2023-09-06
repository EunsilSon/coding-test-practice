class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                continue;
            }
            if (Character.isUpperCase(c)) {
                if ((c + n) <= 'Z') {
                    answer += (char)(c + n);
                } else {
                    answer += (char)(c - 26 + n);
                }
            } else {
                if ((c + n) <= 'z') {
                    answer += (char)(c + n);
                } else {
                    answer += (char)(c - 26 + n);
                }
            }
        }
        
        return answer;
    }
}