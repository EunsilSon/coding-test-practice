class Solution {
    public int thirdMax(int[] nums) {
        /**
         * 내림차순 정렬
         */
        int maxIdx;

        for (int i = 0; i < nums.length; i++) {
            maxIdx = i;

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = nums[maxIdx];
            nums[maxIdx] = nums[i];
            nums[i] = temp;
        }

        /**
         * 중복 제거
         */
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        if (list.size() > 2) {
            return list.get(2); // 세번째 큰 수
        } else {
            return list.get(0); // 첫번째 큰 수
        }
    }
}