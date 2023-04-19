import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payForMoney = sc.nextInt();
        int change = 1000 - payForMoney;
        int coinCount = 0;

        int[] coinList = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coinList.length; i++) {
            if (change >= coinList[i]) {
                coinCount += change / coinList[i];
                change %= coinList[i];

                if (change == 0) {
                    System.out.println(coinCount);
                    break;
                }
            }
        }
    }
}