import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testCases = new int[t];
        int[][] chargeArr = new int[t][4]; // 결과

        for (int i = 0; i < t; i++) {
            testCases[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            if (testCases[i] >= 25) {
                chargeArr[i][0] = testCases[i] / 25;
                testCases[i] %= 25;
            }
            if (testCases[i] >= 10) {
                chargeArr[i][1] = testCases[i] / 10;
                testCases[i] %= 10;
            }
            if (testCases[i] >= 5) {
                chargeArr[i][2] = testCases[i] / 5;
                testCases[i] %= 5;
            }

            chargeArr[i][3] = testCases[i];
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", chargeArr[i][j]);
            }
            System.out.println();
        }
    }
}
