import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());

        int[] parking = new int[100];
        int[][] truck = new int[3][3];
        int first = 100;
        int last = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());

            // n번째 트럭의 주차 시간 체크
            truck[i][0] = start;
            truck[i][1] = end;

            // 요금 계산 범위 측정을 위해 가장 빠른 주차 시간과 마지막 출차 시간 파악
            first = Math.min(first, start);
            last = Math.max(last, end);

            // 시간 당 주차된 트럭 수
            for (int j = start; j < end; j++) {
                parking[j]++;
            }  
        }

        // 요금 계산
        int answer = 0;
        for (int i = first; i < last; i++) {
            answer += parking[i] == 1 ? parking[i] * a : 0;
            answer += parking[i] == 2 ? parking[i] * b : 0;
            answer += parking[i] == 3 ? parking[i] * c : 0;
        }

        System.out.println(answer);
    }
}

