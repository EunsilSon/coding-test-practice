class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            // 이진수 변환
            String s1 = toBinary(arr1[i], n);
            String s2 = toBinary(arr2[i], n);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {

                if (s1.charAt(j) == '1' || s2.charAt(j) == '1' ) {
                    sb.append("#");
                    continue;
                }

                if (s1.charAt(j) == s2.charAt(j)) {
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString();
        }
        
        return answer;
    }
    
    public static String toBinary(int n, int size) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        while (sb.length() < size) {
            sb.append("0");
        }

        return sb.reverse().toString();
    }
    
}