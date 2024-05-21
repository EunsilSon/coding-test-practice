import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static int[] numArr;

    /*
     * 순열 구하기
     */
    public static void permutation(int depth) {
        if (depth == numArr.length) {
            System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        }

        for (int i = 0; i < numArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = numArr[i];
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }

    /*
     * 1 부터 n 까지의 수를 배열에 저장
     */
    public static void getNumArr(int n) {
        numArr = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr = new int[N];
        visited = new boolean[N + 1];

        getNumArr(N);
        permutation(0);
    }
}