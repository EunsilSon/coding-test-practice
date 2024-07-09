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

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void combination(int depth, int start) { 
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int n : arr) {
                sb.append(n).append(" ");
            }

            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
            }
            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = numbers[i];
            combination(depth + 1, i + 1);
        }

    }

}