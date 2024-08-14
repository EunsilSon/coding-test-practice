import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int a = 0;
        int b = 1;

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