import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxLength = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
            maxLength = Math.max(maxLength, list.get(i).length());
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (list.get(j).length()-1 >= i) {
                    answer.append(list.get(j).charAt(i));
                }
            }
        }
        System.out.println(answer);
    }
}
