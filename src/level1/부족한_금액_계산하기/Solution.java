package level1.부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        long doublePrice = 0;
        long result;

        for (int i = 0; i < count; i++) {
            doublePrice += price;
            total += doublePrice;
        }

        result = total < money ? 0 : total - money;
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 20, 4));
    }
}