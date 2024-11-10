import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new TreeMap<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                map.put(name, 1);
                count++;
            } else {
                map.remove(name);
            }
        }

        System.out.println(count);
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}