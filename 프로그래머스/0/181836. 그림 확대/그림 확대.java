class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) { // 문자열의 문자를 k배로 만들기
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            
            for (int j = 0; j < k; j++) { // k배의 문자가 된 문자열을 k번 추가하기
                answer[idx++] = sb.toString();
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}
