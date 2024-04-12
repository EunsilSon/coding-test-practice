import java.util.*;
import java.io.*;

class Node {
    int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new char[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String lines = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = lines.charAt(j);
                dist[i][j] = -1;
            }
        }

        bfs();

        /*
        //dist 배열 확인
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.print(dist[i][j] + " ");
            }
        }
        */
    }
    
    static char[][] graph;
    static int[][] dist; // 시작점 부터 모든 칸의 거리를 계산
    static int N, M;

    static void bfs() {
        int[] distX = {1, 0, -1, 0};
        int[] distY = {0, 1, 0, -1};
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(0,0));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Node n = queue.poll();

            // 상, 하, 좌, 우
            for (int i = 0; i < 4; i++) {
                int dx = n.x + distX[i];
                int dy = n.y + distY[i];

                // 범위 벗어나는지
                if (dx < 0 || dx >= N || dy < 0 ||  dy >= M) {
                    continue;
                }

                // 갈 수 있는지, 방문하지 않은 곳인지
                if (graph[dx][dy] == '0' || dist[dx][dy] != -1) {
                    continue;
                }

                queue.offer(new Node(dx, dy));
                dist[dx][dy] = dist[n.x][n.y]+1; // 이전의 값+1
            }
        }
        System.out.println(dist[N-1][M-1]+1);
    }
}