class Solution {
    public String solution(String new_id) {
        // 소문자, 숫자, -, _, . 만 남기기
        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9\\-\\_\\.]", "");

        // . 2개 이상은 1개로
        new_id = new_id.replaceAll("\\.+", ".");

        // . 이 처음이나 끝에 위치하면 제거
        new_id = removeStartAndEndDot(new_id);

        // 15자 제한
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            new_id = removeStartAndEndDot(new_id);
        }

        // 빈 문자열
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // 2자 이하, 마지막 문자를 3이 될때까지
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    public static String removeStartAndEndDot(String new_id) {
        return new_id.replaceAll("^\\.|\\.$", "");
    }
}