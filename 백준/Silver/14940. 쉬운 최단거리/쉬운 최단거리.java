import java.io.*;
import java.util.*;

class Node {
    int x, y;

    Node (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static void bfs(Node start, int n, int m) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(start.x, start.y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = node.x + dx[i];
                int nY = node.y + dy[i];

                if (nX < 0 || nY < 0 || nX >= n || nY >= m) {
                    continue;
                }

                if (graph[nX][nY] == 1 && !visited[nX][nY]) {
                    queue.offer(new Node(nX, nY));
                    graph[nX][nY] += graph[node.x][node.y];
                    visited[nX][nY] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        Node start = null;

        // 지도 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());

                if (graph[i][j] == 2) {
                    graph[i][j] = 0;
                    start = new Node(i, j);
                }
            }
        }

        // 너비 우선 탐색
        bfs(start, n, m);

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}