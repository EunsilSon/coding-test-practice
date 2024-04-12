import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;

    static void dfs(int x) {
        visited[x] = true;

        for (int i = 0; i < list.get(x).size(); i++) {
            if (!visited[list.get(x).get(i)]) {
                dfs(list.get(x).get(i));
            }
        }
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split(" ");
        N = Integer.parseInt(line1[0]) + 1;
        M = Integer.parseInt(line1[1]);

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

        int answer = 0;
        for (int i = 1; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
}