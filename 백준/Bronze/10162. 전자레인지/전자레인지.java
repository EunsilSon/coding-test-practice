import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 300;
        int b = 60;
        int c = 10;
        int[] countBtn = new int[3];

        if (t >= a) {
            countBtn[0] = t / a;
            t %= a;
        }

        if (t >= b) {
            countBtn[1] = t / b;
            t %= b;
        }

        if (t >= c) {
            countBtn[2] = t / c;
            t %= c;
        }

        if (t == 0) {
            for (int n : countBtn) {
                System.out.printf("%d ", n);
            }
        } else {
            System.out.println(-1);
        }
    }
}
