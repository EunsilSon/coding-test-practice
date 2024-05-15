import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        long a = 0;
        long b = 1;

        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                arr[i] = a + b;
                a = b;
                b = arr[i];
            }
            System.out.println(arr[n-1]);
        }
    }
}