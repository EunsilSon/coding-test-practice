class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < str.length; i++) {
            numbers = numbers.replace(str[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}