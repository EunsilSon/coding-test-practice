import java.util.*;

public class Main {
    static boolean[] visited;
    static int count = 0;

    /**
     * DFS (깊이 우선 탐색)
     * @param network
     * @param x
     * @return
     */
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

    /**
     * BFS (너비 우선 탐색)
     * @param network
     * @param start
     * @return
     */
    public static int bfs(List<ArrayList<Integer>> network, int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < network.get(x).size(); i++) {
                if (!visited[network.get(x).get(i)]) {
                    visited[network.get(x).get(i)] = true;
                    q.offer(network.get(x).get(i));
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int computers = sc.nextInt(); // 컴퓨터의 수
        int connected = sc.nextInt(); // 직접 연결된 컴퓨터 쌍의 수
        visited = new boolean[computers+1]; // 방문 체크

        List<ArrayList<Integer>> network = new ArrayList<>();
        for (int i = 0; i <= computers; i++) {
            network.add(new ArrayList<>());
        }

        for (int i = 0; i < connected; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            network.get(x).add(y);
            network.get(y).add(x);
        }
        System.out.println(bfs(network,1));
    }
}
