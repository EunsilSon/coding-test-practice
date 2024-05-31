class Solution {
    public int solution(int[][] sizes) {
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];

        int maxWidth = sizes[0][0];
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            w[i] = Math.max(sizes[i][0], sizes[i][1]);
            h[i] = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, w[i]);
            maxHeight = Math.max(maxHeight, h[i]);
        }

         return maxWidth * maxHeight;
    }
}