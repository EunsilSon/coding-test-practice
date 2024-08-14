import java.util.*;
import java.io.*;

public class Main {
    static int M;
    static int N;
    static int[][] ground;

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            String[] line1 = br.readLine().split(" ");
            M = Integer.parseInt(line1[0]);
            N = Integer.parseInt(line1[1]);
            int K = Integer.parseInt(line1[2]);
            ground = new int[M][N];

            for (int j = 0; j < K; j++) {
                String[] line2 = br.readLine().split(" ");
                int x = Integer.parseInt(line2[0]);
                int y = Integer.parseInt(line2[1]);
                ground[x][y] = 1;
            }

            int count = 0;
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (isCabbage(x, y)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static boolean isCabbage(int x, int y) {
        if (x < 0 || y < 0 || x >= M || y >= N) {
            return false;
        }

        if (ground[x][y] == 1) {
            ground[x][y] = 0;

            isCabbage(x-1, y);
            isCabbage(x+1, y);
            isCabbage(x, y-1);
            isCabbage(x, y+1);
            return true;
        }
        return false;
    }
}