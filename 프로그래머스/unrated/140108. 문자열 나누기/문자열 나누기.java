class Solution {
    public int solution(String s) {
        int xCount = 0;
        int otherCount = 0;
        int result = 0;
        int idx = 0;
        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (xCount == 0) {
                x = s.charAt(i);
            }

            if (x == s.charAt(i)) {
                xCount++;
            } else {
                otherCount++;
            }

            if (xCount == otherCount) {
                xCount = 0;
                otherCount = 0;
                result++;
                idx = i;
            }
        }

        if (idx == 0 || idx < s.length()-1) {
            result++;
        }
        return result;
    }
}