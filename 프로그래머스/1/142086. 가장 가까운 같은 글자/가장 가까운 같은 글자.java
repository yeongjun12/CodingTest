import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < str.length; i++) {
            int temp = -1; // 초기화

            for(int j = i - 1; j >= 0; j--) { // 현재 문자 이전에 있는 문자들과 비교
                if(str[i].equals(str[j])) {
                    temp = i - j; // 이전 동일한 문자와의 거리 계산
                    break; // 같은 문자를 찾았으면 루프 종료
                }
            }

            list.add(temp);
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
