import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 참가자 이름을 HashMap에 저장 (이름과 출현 횟수를 기록)
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        // 2. 완주자 이름을 HashMap에서 제거 (출현 횟수 감소)
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        // 3. 값이 1인 이름이 완주하지 못한 사람
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        return ""; // 모든 참가자가 완주했다면 빈 문자열 반환
    }
}
