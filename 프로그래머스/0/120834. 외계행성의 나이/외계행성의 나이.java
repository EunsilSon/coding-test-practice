class Solution {
    public String solution(int age) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        String s = Integer.toString(age);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(alphabets[Character.getNumericValue(s.charAt(i))]);
        }
        
        return sb.toString();
    }
}