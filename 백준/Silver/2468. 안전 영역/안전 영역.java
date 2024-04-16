import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static int maxHei;

    public static int dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return 0;
        }

        if (!visited[x][y] && graph[x][y] > maxHei) {
            visited[x][y] = true;

            dfs(x, y-1);
            dfs(x, y+1);
            dfs(x-1, y);
            dfs(x+1, y);
        }
        return 1;
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        graph = new int[n][n];

        maxHei = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int height = Integer.parseInt(st.nextToken());
                maxHei = Math.max(maxHei, height);
                graph[i][j] = height;
            }
        }

        int answer = 0;

        while (maxHei > 0) {
            --maxHei;
            visited = new boolean[n][n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && graph[i][j] > maxHei) {
                        count += dfs(i, j);
                    }
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}