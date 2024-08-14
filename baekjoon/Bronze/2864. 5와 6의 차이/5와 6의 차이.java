import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int fiveSum, sixSum;
        String strA, strB;

        // 5로 계산
        strA = String.valueOf(a).replace("6", "5");
        strB = String.valueOf(b).replace("6", "5");
        fiveSum = Integer.parseInt(strA) + Integer.parseInt(strB);

        // 6으로 계산
        strA = String.valueOf(a).replace("5", "6");
        strB = String.valueOf(b).replace("5", "6");
        sixSum = Integer.parseInt(strA) + Integer.parseInt(strB);

        if (fiveSum > sixSum) {
            System.out.printf("%d %d", sixSum, fiveSum);
        } else {
            System.out.printf("%d %d", fiveSum, sixSum);
        }
    }
}
