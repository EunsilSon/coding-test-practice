class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            switch(mode) {
                case 0:
                    if (code.charAt(i) == '1') {
                        mode = 1;
                    } else {
                        if (i % 2 == 0) {
                            ret.append(code.charAt(i));
                        }
                    }
                    break;
                case 1:
                    if (code.charAt(i) == '1') {
                        mode = 0;
                    } else {
                        if (i % 2 != 0) {
                            ret.append(code.charAt(i));
                        }
                    }
                    break;
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}