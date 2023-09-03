import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // name, yearning 를 hashmap에 key,value로 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
            //answer.add(0);
        }

        // 외부: photo 길이
        // 내부: photo[i] 길이
        // photo[i]를 key 값으로 하고, value를 answer[i]에 누적합
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    //answer.set(i, answer.get(i) + map.get(photo[i][j]));
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }


        return answer;
    }
}