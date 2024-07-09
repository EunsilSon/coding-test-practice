import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static int[] numbers;
    static ArrayList<String> list = new ArrayList<>();

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

        Arrays.sort(numbers); // 정렬
        combination(0, 0);

    }

    public static void combination(int depth, int start) {
        if (depth == M) {

            for (int n : arr) {
                System.out.print(n + " ");
            }

            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = numbers[i];
            combination(depth + 1, i + 1);
        }

    }
}