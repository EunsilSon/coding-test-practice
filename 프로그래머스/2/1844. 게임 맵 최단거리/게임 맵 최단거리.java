import java.util.*;

class Solution {
    static class Node {
        int x, y, cnt;

        Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    
    static int bfs(int n, int m, int[][] maps) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0,0, 1));
        maps[0][0] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                // 상, 하, 좌, 우 방향 이동
                int pX = node.x + dx[i];
                int pY = node.y + dy[i];

                // 상대 팀 진영 체크
                if (pX == n && pY == m) {
                    return node.cnt+1;
                }

                // 유효 범위 체크
                if (pX < 0 || pY < 0 || pX > n || pY > m) {
                    continue;
                }

                // 캐릭터 이동
                if (maps[pX][pY] == 1) {
                    queue.offer(new Node(pX, pY, node.cnt+1));
                    maps[pX][pY] = 0; // 방문 체크
                }

            }
        }
        return -1;
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        return bfs(n-1, m-1, maps);
    }
}