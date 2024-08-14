import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[][] graph;
    public static boolean[] visited;

    public static void dfs(int x) {
        visited[x] = true;
        sb.append(x + " ");

        for (int y = 1; y < graph[x].length; y++) {
            if (graph[x][y] == 1 && !visited[y]) {
                dfs(y);
            }
        }
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            x = queue.poll();
            sb.append(x + " ");

            for (int y = 1; y < graph[x].length; y++) {
                if (graph[x][y] == 1 && !visited[y]) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr1 = br.readLine().split(" ");

        int n = Integer.parseInt(inStr1[0]);
        int m = Integer.parseInt(inStr1[1]);
        int v = Integer.parseInt(inStr1[2]);

        graph = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            String[] inStr2 = br.readLine().split(" ");

            int x = Integer.parseInt(inStr2[0]);
            int y = Integer.parseInt(inStr2[1]);

            graph[x][y] = graph[y][x] = 1;
        }


        visited = new boolean[n+1];
        dfs(v);
        visited = new boolean[n+1];
        sb.append("\n");
        bfs(v);

        System.out.println(sb);
    }
}
