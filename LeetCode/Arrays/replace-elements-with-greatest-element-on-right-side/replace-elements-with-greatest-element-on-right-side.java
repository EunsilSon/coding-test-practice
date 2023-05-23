class Solution {
    public int[] replaceElements(int[] arr) {
        int[] resultArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

            resultArr[i] = max;
        }

        return resultArr;
    }
}