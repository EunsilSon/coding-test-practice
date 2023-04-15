import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] question = input.split("-"); // '-'를 기준으로 문자열 분리

        int result = 0;
        for (int i = 0; i < question.length; i++) {
            String[] addition = question[i].split("\\+");

            int additionNum = 0;
            for (int j = 0; j < addition.length; j++) {
                additionNum += Integer.parseInt(addition[j]);
            }

            if (i == 0) { // 첫번째 정수는 양수
                result = additionNum;
            } else {
                result -= additionNum;
            }
        }
        System.out.println(result);
    }
}
