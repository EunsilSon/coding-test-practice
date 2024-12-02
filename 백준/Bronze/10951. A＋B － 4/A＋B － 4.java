import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> answer = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            answer.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }

        for (int n : answer) {
            System.out.println(n);
        }
    }
}