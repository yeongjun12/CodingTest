class Solution {
    public String solution(String my_string, int n) {
        String answer = ""; // 결과 문자열을 저장할 변수 생성

        // 문자열의 각 문자에 대해 반복문을 수행합니다.
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 현재 문자를 가져옵니다.
            for (int j = 0; j < n; j++) {
                answer += ch; // 현재 문자를 n번 반복하여 결과에 추가합니다.
            }
        }

        return answer; // 결과 문자열을 반환합니다.
    }
}
