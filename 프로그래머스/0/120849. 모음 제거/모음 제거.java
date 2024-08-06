class Solution {
    public String solution(String my_string) {
        String[] alphabets = {"a", "e", "i", "o", "u"};
        
        for (String a : alphabets) {
            my_string = my_string.replace(a, "");
        }
        
        return my_string;
    }
}