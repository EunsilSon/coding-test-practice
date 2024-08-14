import java.util.*;
import java.io.*;

public class Main {
    static int w, h;
    static int[][] graph;
    static int[] dx = {0, 0, -1, 1, -1, 1, 1, -1};
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};

    static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= h || y >= w) {
            return;
        }

        if (graph[x][y] == 1) {
            graph[x][y] = 0;

            for (int i = 0; i < 8; i++) {
                dfs(x + dx[i], y + dy[i]);
            }
        }
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            graph = new int[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (graph[i][j] != 0) {
                        count++;
                        dfs(i, j);

                    }
                }
            }
            
            if (count >= 1) {
                list.add(count);
            } else {
                list.add(0);
            }
            
        }

        for (int n : list) {
            System.out.println(n);
        }
    }
}