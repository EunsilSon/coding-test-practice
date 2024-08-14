import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());

        numbers = new int[N];
        arr = new int[M];
        visited = new boolean[N+1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(numbers);
        permutation(0);

    }

    // 순열
    public static void permutation(int depth) {
        if (depth == M) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = numbers[i];
                permutation(depth+1);
                visited[i] = false;
            }
        }
    }

}
