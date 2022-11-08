class Solution {
  public int solution(int[] numbers) {
      int answer = 0;
      int[] numberArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      boolean isMatched = true;
      
      
      for (int i = 0; i < numberArr.length; i++) {
          for (int j = 0; j < numbers.length; j++) {
              if (numberArr[i] == numbers[j]) {
                  isMatched = true;
                  break;
              } else {
                  isMatched = false;
              }
          }
          
          if (isMatched == false) {
              answer += numberArr[i];
          }
      }
      
      return answer;
  }
}