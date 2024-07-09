import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static int[] numbers;
    static LinkedHashSet<String> set = new LinkedHashSet<>();


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
        duplicatePermutation(0);

        for (String s : set) {
            System.out.println(s);
        }

    }

    public static void duplicatePermutation(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int n : arr) {
                sb.append(n).append(" ");
            }

            set.add(sb.toString().trim()); // 시간 초과 방지
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = numbers[i];
            duplicatePermutation(depth + 1);
        }

    }
}