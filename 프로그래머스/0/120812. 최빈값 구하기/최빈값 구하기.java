class Solution {
    public int solution(int[] array) {
        int[] countArr = new int[1000];
        int max = 0;
        int answer = 0;
        
        
        // 등장 횟수 카운팅
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }
        
        
        // 최빈값 구하기
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                answer = i;
                continue;
            }
            
            if (max == countArr[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}