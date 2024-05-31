import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> numberMap = createNumberMap();
        
        // 숫자를 문자열로 바꾸는 과정
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                StringBuilder temp = new StringBuilder();
                temp.append(ch);
                // 현재 문자가 영단어의 시작인 경우
                while (!numberMap.containsKey(temp.toString())) {
                    i++;
                    temp.append(s.charAt(i));
                }
                sb.append(numberMap.get(temp.toString()));
            }
        }
        
        // 문자열을 정수로 변환하여 반환
        answer = Integer.parseInt(sb.toString());
        
        return answer;
    }
    
    // 각 영단어에 대응되는 숫자의 맵을 생성하는 메서드
    private Map<String, Integer> createNumberMap() {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        return numberMap;
    }
}
