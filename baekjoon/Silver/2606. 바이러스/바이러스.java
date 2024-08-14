import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int count = 0;

    public static int dfs(List<ArrayList<Integer>> network, int x) {
        visited[x] = true;

        for (int i = 0; i < network.get(x).size(); i++) {
            if (!visited[network.get(x).get(i)]) {
                dfs(network, network.get(x).get(i));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int connected = Integer.parseInt(br.readLine()); // 직접 연결된 컴퓨터 쌍의 수
        visited = new boolean[computers+1]; // 방문 체크

        List<ArrayList<Integer>> network = new ArrayList<>();
        for (int i = 0; i <= computers; i++) {
            network.add(new ArrayList<>());
        }

        for (int i = 0; i < connected; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            network.get(x).add(y);
            network.get(y).add(x);
        }
        System.out.println(dfs(network,1));
    }
}