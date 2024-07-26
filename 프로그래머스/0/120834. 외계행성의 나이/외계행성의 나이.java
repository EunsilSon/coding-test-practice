class Solution {
    public String solution(int age) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',  'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        String s = Integer.toString(age);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(alphabets[Character.getNumericValue(s.charAt(i))]);
        }
        
        return sb.toString();
    }
}