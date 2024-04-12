import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }

        int count = 0;
        int temp;
        boolean[] visited = new boolean[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            count++;
            
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x = queue.poll();

                if (x-1 == K || x+1 == K || x*2 == K) {
                    System.out.println(count);
                    return;
                }

                temp = x-1;
                if (temp >= 0 && !visited[temp]) {
                    queue.add(temp);
                    visited[temp] = true;
                }

                temp = x+1;
                if (temp < visited.length && !visited[temp]) {
                    queue.add(temp);
                    visited[temp] = true;
                }

                temp = x*2;
                if (temp < visited.length && !visited[temp]) {
                    queue.add(temp);
                    visited[temp] = true;
                }
            }
        }
    }
}