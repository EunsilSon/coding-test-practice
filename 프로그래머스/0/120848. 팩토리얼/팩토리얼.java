class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;
        
        while (true) {
            factorial *= i;
            if (factorial > n) break;
            i++;
        }
        
        return i-1;
    } 
}