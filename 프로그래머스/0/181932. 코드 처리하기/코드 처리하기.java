class Solution {
    public String solution(String code) {
        if (code.isEmpty()) return "EMPTY";
        
        StringBuilder ret = new StringBuilder();
        int mode = 0; // 초기 mode는 0
        
        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            
            if (ch == '1') { // 문자가 "1"이면 mode를 변경
                mode = 1 - mode; // mode를 0과 1 사이에서 번갈아가며 변경
            } else { // 문자가 "1"이 아닌 경우
                if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 != 0)) {
                    ret.append(ch);
                }
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
