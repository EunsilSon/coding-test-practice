import java.util.*;

class Solution {
    public int solution(String s) {
        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(alphabet[i], i);
        }

        StringBuilder temp = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
            } else {
                temp.append(s.charAt(i));

                if (map.containsKey(temp.toString())) {
                    answer.append(map.get(temp.toString()));
                    temp.setLength(0);
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}