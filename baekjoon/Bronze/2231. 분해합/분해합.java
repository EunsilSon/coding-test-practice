import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasConstructor = false;

        for (int i = 0; i < n; i++) {
            int number = i; // 분해합
            int sum = 0; // 각 자릿수의 합계

            while (number != 0) { // 각 자릿수를 모두 더할 때까지
                sum += number % 10;
                number /= 10;
            }

            if ((i + sum) == n) {
                System.out.println(i);
                hasConstructor = true;
                break;
            }
        }
        if (!hasConstructor) {
            System.out.println(0);
        }
    }
}