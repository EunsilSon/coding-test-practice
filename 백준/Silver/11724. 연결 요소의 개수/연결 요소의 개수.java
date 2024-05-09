import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;

    public static void dfs(int x) {
        visited[x] = true;

        for (int y = 0; y < list.get(x).size(); y++) {
            if (!visited[list.get(x).get(y)]) {
                dfs(list.get(x).get(y));
            }
        }
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            x = queue.poll();

            for (int y = 0; y < list.get(x).size(); y++) {
                int node = list.get(x).get(y);
                if (!visited[node]) {
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split(" ");
        int N = Integer.parseInt(line1[0]) + 1;
        int M = Integer.parseInt(line1[1]);

        visited = new boolean[N];
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] line2 = br.readLine().split(" ");
            int x = Integer.parseInt(line2[0]);
            int y = Integer.parseInt(line2[1]);
            list.get(x).add(y);
            list.get(y).add(x);
        }


        int count = 0;
        for (int i = 1; i < N; i++) {
            if (!visited[i]) {
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
}