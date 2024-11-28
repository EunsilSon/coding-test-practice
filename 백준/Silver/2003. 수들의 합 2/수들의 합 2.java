import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        counting(arr, N, M);
    }

    public static void counting(int[] arr, int N, int M) {
        int start = 0;
        int end = 0;
        int count = 0;
        int total = 0;

        while (true) {
            if (total >= M) {
                total -= arr[start++];
            } else if (end == N) {
                break;
            } else {
                total += arr[end++];
            }

            if (total == M) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}