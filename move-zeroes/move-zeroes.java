class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-count; i++) {
            if (i > 0 && nums[i-1] == 0) {
                --i;
            }

            if (nums[i] == 0) {
                count++;

                /**
                 * 1. 버블 정렬 사용
                 */
                for (int j = i; j < nums.length-1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

                /**
                 * 2. 배열의 원소를 한 칸씩 앞으로 밀기
                 
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }

                nums[nums.length-count] = 0;
                 */
            }
        }
    }
}