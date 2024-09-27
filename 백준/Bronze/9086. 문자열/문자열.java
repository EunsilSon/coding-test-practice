import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] answer = new String[T];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            sb.setLength(0);
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1));

            answer[i] = sb.toString();
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
