class Solution {
    public int solution(int[][] dots) {
        int maxX = -256;
        int minX = 256;
        int maxY = -256;
        int minY = 256;
        
        for (int i = 0; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}