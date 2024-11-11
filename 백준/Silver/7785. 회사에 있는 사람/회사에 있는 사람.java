import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Set<String> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            String[] info = br.readLine().split(" ");
            if (info[1].equals("enter")) {
                set.add(info[0]);
            } else {
                set.remove(info[0]);
            }
        }

        for (String p : set) {
            System.out.println(p);
        }
    }
}