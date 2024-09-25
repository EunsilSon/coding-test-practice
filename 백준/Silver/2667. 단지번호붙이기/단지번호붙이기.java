import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int apt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                apt = 0;

                if (graph[i][j] == 1) {
                    dfs(graph, i, j);
                    list.add(apt);
                    count++;
                }
            }
        }

        System.out.println(count);
        Collections.sort(list);
        for(int num : list) {
            System.out.println(num);
        }
    }

    public static void dfs(int[][] graph, int x, int y) {
        if (x < 0 || y < 0 || x >= graph.length || y >= graph[x].length) {
            return;
        }

        if (graph[x][y] == 1) {
            graph[x][y] = 0;
            apt++;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                dfs(graph, nx, ny);
            }
        }
    }
}
