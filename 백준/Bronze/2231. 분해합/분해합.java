import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = N;
        boolean flag = false;

        for (int i = N; i >= 0; i--) {
            int con = i;
            int sum = i;

            while (con != 0) {
                sum += con % 10;
                con /= 10;
            }

            if (sum == N) {
                flag = true;
                answer = i;
            }
        }

        if (!flag) {
            answer = 0;
        }
        System.out.println(answer);
    }
}