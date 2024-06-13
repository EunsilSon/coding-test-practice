import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        ArrayList<String> list = new ArrayList<>();

        // 사용된 알파벳 추출
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(String.valueOf(str.charAt(i)))) {
                list.add(String.valueOf(str.charAt(i)));
            }
        }

        String answer = "";
        int maxLength = 0;

        // 가장 많이 사용된 알파벳 추출
        for (int i = 0; i < list.size(); i++) {

            if (maxLength < count(str, list.get(i))) {
                maxLength = count(str, list.get(i));
                answer = list.get(i);
                continue;
            }

            if (maxLength == count(str, list.get(i))) {
                answer = "?";
            }

        }

        System.out.println(answer);
    }

    // 문자열에 존재하는 특정 알파벳의 개수
    public static int count(String str, String s) {
        return str.length() - str.replace(s, "").length();
    }
}