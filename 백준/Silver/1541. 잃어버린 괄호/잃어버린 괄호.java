import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] strArr = input.split("-");

        for (int i = 0; i < strArr.length; i++) {
            int temp = 0;
            if (strArr[i].contains("+")) {
                String[] intArr = strArr[i].split("\\+");

                for (int j = 0; j < intArr.length; j++) {
                    temp += Integer.parseInt(intArr[j]);
                }
                strArr[i] = String.valueOf(temp);
            }
        }

        int answer = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            answer -= Integer.parseInt(strArr[i]);
        }

        System.out.println(answer);

    }
}
