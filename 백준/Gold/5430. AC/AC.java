import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Deque<Integer> deque;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String p = sc.next();
            int n = sc.nextInt();

            // 숫자만 추출
            String inputNums = sc.next(); // [1,2,3,4]
            String temp = inputNums.substring(1, inputNums.length()-1); // 1,2,3,4
            String[] nums = temp.split(",");


            // deque 에 값 넣기
            deque = new ArrayDeque<>();

            for (int j = 0; j < nums.length; j++) {
                if (!nums[j].equals("")) {
                    deque.addLast(Integer.parseInt(nums[j]));
                }
            }

            boolean isFront = true;
            boolean isError = false;

            // 연산
            for (int j = 0; j < p.length(); j++) {

                if (p.charAt(j) == 'R') {
                    isFront = !isFront;
                } else {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }

                    if (isFront) {
                        deque.pollFirst();
                    } else {
                        deque.pollLast();
                    }
                }
            }

            // 결과 출력
            makeOuput(deque, sb, isFront, isError);

        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

    }


    public static void makeOuput(Deque<Integer> deque, StringBuilder sb, boolean isFront, boolean isError) {

        if (isError) {
            sb.append("error\n");
            return;
        }

        if (deque.isEmpty()) {
            sb.append("[]\n");
            return;
        }

        if (isFront) {
            sb.append("[");
            while (deque.size() > 1) {
                sb.append(deque.pollFirst() + ",");
            }
            sb.append(deque.pollFirst() + "]\n");

        } else {
            sb.append("[");
            while (deque.size() > 1) {
                sb.append(deque.pollLast() + ",");
            }
            sb.append(deque.pollLast() + "]\n");
        }
    }
}