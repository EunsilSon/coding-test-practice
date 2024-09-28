import java.util.*;

class Node {
    String id;
    List<String> report;
    int mail;
    
    Node(String id) {
        this.id = id;
        this.report = new ArrayList<>();
        this.mail = 0;
    }
    
    public void setReport(String id) {
        this.report.add(id);
    }
    
    public void setMailCount() {
        this.mail++;
    }
    
    public List<String> getList() {
        return this.report;
    }
    
    public int getMailCount() {
        return this.mail;
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> count = new HashMap<>();
        List<Node> users = new ArrayList<>();
        for (String s : id_list) {
            count.put(s, 0);
            users.add(new Node(s));
        }

        // 신고 취합
        for (int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            boolean isReport = false;

            for (Node user : users) {
                if (user.id.equals(temp[0])) {
                    List<String> reportList = user.getList();
                    for (String r : reportList) {
                        if (r.equals(temp[1])) {
                            isReport = true;
                            break;
                        }
                    }
                }
            }

            if (!isReport) {
                count.put(temp[1], count.get(temp[1]) + 1);
                for (Node node : users) {
                    if (node.id.equals(temp[0])) {
                        node.setReport(temp[1]);
                    }
                }
            }
        }

        // 신고 결과
        for (String key : count.keySet()) {
            if (count.get(key) >= k) {
                for (Node u : users) {
                    List<String> reportList = u.getList();
                    for (String r : reportList) {
                        if (key.equals(r)) {
                            u.setMailCount();
                            break;
                        }
                    }
                }

            }
        }

        /* 결과 메일 */
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = users.get(i).getMailCount();
        }
        
        return answer;
    }
}