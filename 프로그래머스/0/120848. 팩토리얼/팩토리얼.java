class Solution {
    public int solution(int n) {
        
        int i = 1;
        
        while (true) {
            if (factorial(i) > n) {
                break;
            }
            i++;
        }
        
        return i-1;
        
    }
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        
        return factorial(n - 1) * n;
    }
}