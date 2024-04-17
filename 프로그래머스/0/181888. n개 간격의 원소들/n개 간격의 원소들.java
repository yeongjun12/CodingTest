import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList를 Integer 타입으로 선언

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // ArrayList의 요소를 int 배열에 복사
        }

        return answer; // int[] 타입의 배열을 반환
    }
}
