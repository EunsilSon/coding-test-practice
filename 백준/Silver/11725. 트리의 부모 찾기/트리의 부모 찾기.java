import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean[] visited;
    static int[] parents;

    public static void dfs(int x) {
        visited[x] = true;

        for (int node : tree.get(x)) {
            if (!visited[node]) {
                dfs(node);
                parents[node] = x;
            }
        }
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            tree.get(x).add(y);
            tree.get(y).add(x);
        }

        visited = new boolean[N+1];
        parents = new int[N+1];
        dfs(1);

        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }
}