import java.io.*;

public class Main {
    static int k;
    static StringBuilder[] stringBuilders;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        k = Integer.parseInt(br.readLine());
        arr = new int[(int)Math.pow(2, k) - 1];
       
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        // 노드 저장 공간
        stringBuilders = new StringBuilder[k];
        for (int i = 0; i < k; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        getTree(0, arr.length-1, 0);

        // 레벨 별 출력
        for (int i = 0; i < k; i++) {
            System.out.println(stringBuilders[i]);
        }
    }

    public static void getTree(int start, int end, int floor) {
        if (floor == k) {
            return;
        }

        int mid = (start + end) / 2;
        stringBuilders[floor].append(arr[mid] + " ");
        getTree(start, mid-1, floor+1);
        getTree(mid+1, end, floor+1);
    }
}