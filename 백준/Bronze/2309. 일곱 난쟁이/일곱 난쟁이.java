import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                if ((sum - temp) == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);

                    for (int n : arr) {
                        if (n != 0) {
                            System.out.println(n);
                        }
                    }
                    return;
                } 
            }
        }
    }
}