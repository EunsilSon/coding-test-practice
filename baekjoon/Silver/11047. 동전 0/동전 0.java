import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        int[] coinList = new int[n];
        for (int i = 0; i < coinList.length; i++) {
            coinList[i] = Integer.parseInt(br.readLine());
        }

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coinList = new int[n];
        for (int i = 0; i < coinList.length; i++) {
            coinList[i] = sc.nextInt();
        }*/

        int countCoin = 0;
        for (int i = coinList.length-1; i >= 0; i--) {
            if (k >= coinList[i]) {
                countCoin += k / coinList[i];
                k %= coinList[i];
            }

            // 동전 개수가 모두 정해졌을 때
            if (k == 0) {
                break;
            }
        }

        System.out.println(countCoin);
    }
}
