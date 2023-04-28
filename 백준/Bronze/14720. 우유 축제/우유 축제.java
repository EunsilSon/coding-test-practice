import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] milkArr = new int[n];

        for (int i = 0; i < n; i++) {
            milkArr[i] = sc.nextInt();
        }

        int answer = 0;
        int nextMilk = 0;
        for (int i = 0; i < n; i++) {
            if (milkArr[i] == 0 && nextMilk == 0) {
                answer++;
                nextMilk = 1;
            }
            if (milkArr[i] == 1 && nextMilk == 1) {
                answer++;
                nextMilk = 2;
            }
            if (milkArr[i] == 2 && nextMilk == 2) {
                answer++;
                nextMilk = 0;
            }
        }

        System.out.println(answer);
    }
}