class Solution {
    public String[] solution(String[] str_list) {
        String str = String.join("", str_list);
        
        int start = 0;
        int end = 0;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                end = i;
                break;
            }
            if (str_list[i].equals("r")) {
                start = i+1;
                end = str_list.length;
                break;
            }
        }
        
        str = str.substring(start, end);
        
        String[] answer = {};
        if (str.length() > 0) {
            answer = str.split("");
        }
        
        return answer;
    }
}