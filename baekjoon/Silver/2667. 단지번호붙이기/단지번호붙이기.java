import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] aptMap;
    static ArrayList<Integer> aptList;
    static int aptCount;

    public static boolean dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= N || j >= N) {
            return false;
        }

        if (aptMap[i][j] == 1) {
            aptMap[i][j] = 0;
            aptCount++;

            dfs(i-1, j);
            dfs(i+1, j);
            dfs(i, j-1);
            dfs(i, j+1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        N = Integer.parseInt(br.readLine());
        aptMap = new int[N][N];
        aptList = new ArrayList<>();
        aptCount = 0;

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                aptMap[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0;  j < N; j++) {
                aptCount = 0;
                if (aptMap[i][j] == 1) {
                    dfs(i, j);
                    aptList.add(aptCount);
                }
            }
        }

        System.out.println(aptList.size());
        Collections.sort(aptList);

        for (int n : aptList) {
            System.out.println(n);
        }
    }
}
