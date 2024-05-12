import java.util.*;

class Node {
    int x, y, d;

    Node (int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}

class Solution {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    
    public static int bfs(int[][] maps) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));
        maps[0][0] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx == maps.length-1 && ny == maps[0].length-1) {
                    return node.d + 1;
                }

                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) {
                    continue;
                }

                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    queue.add(new Node(nx, ny, node.d + 1));
                }
            }
        }
        return -1;
    }
    
    public int solution(int[][] maps) {
        return bfs(maps);
    }
}