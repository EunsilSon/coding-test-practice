class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];

        // 한칸씩 뒤로 밀면서 끊고 substring
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.setLength(0);
            sb.append(s, 0, i); // 문자열, 시작 인덱스, 끝 인덱스

            // 끊은 문자열 내에 같은 문자의 위치 찾고 lastIndexOf
            int lastIdx = sb.lastIndexOf(String.valueOf(s.charAt(i)));

            // 현재 문자 인덱스 - 찾은 문제 인덱스
            if (lastIdx == -1) {
                result[i] = lastIdx;
            } else {
                result[i] = i - lastIdx;
            }
        }
        
        return result;
    }
}