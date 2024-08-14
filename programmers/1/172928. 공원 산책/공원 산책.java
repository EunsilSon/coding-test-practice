class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length; // 세로
        int W = park[0].length(); // 가로

        /*
        시작 지점 찾기
         */
        int sh = 0;
        int sw = 0;
        
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                sh = i;
                sw = park[i].indexOf("S");
            }
        }

        /*
        산책
         */
        for (String route : routes) {
            int nh = sh;
            int nw = sw;
            int direction = route.charAt(0);
            int move = Character.getNumericValue(route.charAt(2));

            for (int i = 0; i < move; i++) {
                if (direction == 'N') nh--;
                if (direction == 'S') nh++;
                if (direction == 'W') nw--;
                if (direction == 'E') nw++;

                if (nh >= 0 && nh < H && nw >= 0 && nw < W) { // 유효 범위
                    if (park[nh].charAt(nw) == 'X') break; // 이동 범위 내 장애물 유무

                    if (i == move-1) {
                        sh = nh;
                        sw = nw;
                    }
                }

            }
        }
        
        int[] answer = new int[2];
        answer[0] = sh;
        answer[1] = sw;
        
        return answer;
    }
}