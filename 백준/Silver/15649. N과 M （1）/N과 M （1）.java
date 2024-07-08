import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N+1];

        permutation(0);

    }

    public static void permutation(int depth) {
        if (depth == M) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                permutation(depth+1);
                visited[i] = false;
            }
        }
    }
}
