package level1.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int stringLength = s.length(); // 문자열 길이

        if (stringLength % 2 == 0) { // 짝수
            answer += s.charAt((stringLength / 2) - 1);
            answer += s.charAt((stringLength / 2));
        } else { // 홀수
            answer += s.charAt((stringLength / 2) + (stringLength % 2) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
       Solution s = new Solution();
        System.out.println(s.solution("abcde"));
    }
}