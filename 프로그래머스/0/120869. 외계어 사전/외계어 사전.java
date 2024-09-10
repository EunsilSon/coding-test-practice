import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (int i = 0; i < dic.length; i++) {
            String checkStr = String.join("", spell);
            
            for (String s : spell) {
                String temp = dic[i].replaceFirst(s, "");
                
                if (!temp.equals(dic[i])) {
                    checkStr = checkStr.replace(s, "");
                }
                dic[i] = temp;
            }
            
            if (dic[i].isEmpty() && checkStr.isEmpty()) {
                return 1;
            }
        }
        return 2;
        
    }
}