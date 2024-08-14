import java.io.*;
import java.util.*;

public class Main {
    static int[] arrA;
    static int[] arrB;

    public static int binarySearch(int target) {
        int start = 0;
        int end = arrA.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > arrA[mid]) {
                start = mid + 1;
            } else if (target < arrA[mid]) {
                end = mid - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arrA = new int[N];
        String[] line1 = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(line1[i]);
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        arrB = new int[M];
        String[] line2 = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(line2[i]);
        }

        // 정렬
        Arrays.sort(arrA);

        // 이진 탐색
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arrB[i]));
        }

    }
}