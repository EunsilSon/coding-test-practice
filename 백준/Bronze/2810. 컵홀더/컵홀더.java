import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();

        int usingCupHolder = n + 1; // 좌측 컵홀더 1개 추가
        int coupleCount = 0;

        for (int i = 0; i < seats.length(); i++) {
            coupleCount += seats.charAt(i) == 'L' ? 1 : 0;
        }

        if (coupleCount == 0) { // 커플 좌석이 없을 때
            System.out.println(n);
        } else {
            usingCupHolder -= coupleCount / 2; // 커플 좌석 개수만큼 빼기
            System.out.println(usingCupHolder);
        }
    }
}