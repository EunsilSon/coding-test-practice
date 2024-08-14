import java.util.*;

class Solution {
    static int result;

    public int solution(int[] ingredient) {
        result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
            if (stack.size() >= 4) {
                checkStack(stack);
            }
        }

        return result;
    }

    private static void checkStack(Stack<Integer> stack) {
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += Integer.toString(stack.pop());
        }

        if (!str.equals("1321")) {
            for (int i = 3; i >= 0; i--) {
                stack.add(Character.getNumericValue(str.charAt(i)));
            }
        } else {
            result++;
        }
    }
}