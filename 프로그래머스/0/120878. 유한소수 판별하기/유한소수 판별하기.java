class Solution {
    public int solution(int a, int b) {
        boolean flag = false;
        
        // 기약 분수
        int num = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                num = i;
            }
        }
        
        if (num != 0) {
            b /= num;
        }
        
        
        // 소인수
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
}