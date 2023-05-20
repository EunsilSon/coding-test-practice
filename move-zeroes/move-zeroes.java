class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-count; i++) {
            
            if (i > 0 && nums[i-1] == 0) {
                --i;
            }
            
            if (nums[i] == 0) {
                count++;
                
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                
                nums[nums.length-count] = 0;
            }
            
        }
    }
}