import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int money = 1000 - n;
        int coin = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coins.length; i++) {
            if (money != 0) {
                coin += money / coins[i];
                money %= coins[i];
            } else {
                break;
            }
        }
        System.out.println(coin);
    }
}