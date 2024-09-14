class Solution {
    public String solution(String myString) {
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                myString = myString.replace(String.valueOf(c), "l");
            }
        }
        return myString;
    }
}