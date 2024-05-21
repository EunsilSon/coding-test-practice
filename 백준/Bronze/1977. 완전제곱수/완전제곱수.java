import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int result = 0;
        int min = N;

        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) % 1 == 0.0) {
                result += i;
                min = Math.min(min, i);
            }
        }

        if (result == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result + "\n" + min);
        }
    }
}