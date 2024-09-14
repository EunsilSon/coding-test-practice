class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        char input;
        for (char c : myString.toCharArray()) {
            input = (c == 'A') ? 'B' : 'A';
            sb.append(input);
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}