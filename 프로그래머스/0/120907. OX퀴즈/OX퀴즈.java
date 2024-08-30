import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            
            int n1 = Integer.parseInt(temp[0]);
            int n2 = Integer.parseInt(temp[2]);
            int result = Integer.parseInt(temp[4]);
            String oper = temp[1];
            
            String input = "";
            switch(oper) {
                case "-":
                    input = ((n1 - n2) == result) ? "O" : "X";
                    break;
                case "+":
                    input = ((n1 + n2) == result) ? "O" : "X";
            }
            
            list.add(input);
        }
        
        return list.toArray(new String[list.size()]);
    }
}