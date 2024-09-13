class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String result = "";
        result += my_string.substring(0, s);
        result += overwrite_string;
        result += my_string.substring(overwrite_string.length() + s);
        return result;
    }
}