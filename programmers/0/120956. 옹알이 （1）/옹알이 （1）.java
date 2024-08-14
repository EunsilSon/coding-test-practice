class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int result = 0;

        for (String b : babbling) {
            for (String s : str) {
                b = b.replace(s, " ");
            }
            if (b.replaceAll(" ", "").isEmpty()) {
                result++;
            }
        }
        
        return result;
    }
}