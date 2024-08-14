class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return min + " " + max;
    }
}