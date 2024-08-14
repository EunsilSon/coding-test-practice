class Solution {
    public int solution(int n, int k) {
        
        n *= 12000; // 먹은 양꼬치 가격
        
        int total = n / 120000; // 서비스 받은 음료수 개수
        
        k -= total;
        k *= 2000;
        
        return n + k;
    }
}