import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr, numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());

        numbers = new int[N];
        arr = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(numbers); // 정렬

        duplicateCombination(0, 0);
        System.out.println(sb.toString());

    }

    public static void duplicateCombination(int depth, int start) {
        if (depth == M) {
            for (int n : arr) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        int previous = -1;
        for (int i = start; i < N; i++) {
            if (previous != numbers[i]) {
                previous = numbers[i];
                arr[depth] = numbers[i];
                duplicateCombination(depth + 1, i);
            }
        }

    }
}