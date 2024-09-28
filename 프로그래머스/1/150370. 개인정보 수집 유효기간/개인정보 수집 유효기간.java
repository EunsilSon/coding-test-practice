import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // 현재 날짜
        String[] current = today.split("\\.");
        int currentYear = Integer.parseInt(current[0]);
        int currentMonth = Integer.parseInt(current[1]);
        int currentDay = Integer.parseInt(current[2]);
        
        // 약관 정보
        Map<String, Integer> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] temp = terms[i].split(" ");
            termsMap.put(temp[0], Integer.parseInt(temp[1]) * 28);
        }
        
        // 유효기간 체크
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split("[ .]");
            int privacyYear = Integer.parseInt(p[0]);
            int privacyMonth = Integer.parseInt(p[1]);
            int privacyDay = Integer.parseInt(p[2]);
            String privacyType = p[3];
            
            int total = 0;
            total += (currentYear - privacyYear) * 12 * 28;
            total += (currentMonth - privacyMonth) * 28;
            total += currentDay - privacyDay; 
            
            if (termsMap.get(privacyType) <= total) {
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}