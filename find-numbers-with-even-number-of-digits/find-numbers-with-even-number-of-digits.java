class Solution {
    public int findNumbers(int[] nums) {
        int countForEvenNumber = 0;

        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0) {
                countForEvenNumber++;
            }
        }
        return countForEvenNumber;
    }
}