import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(count + d[i] <= budget){ // 현재 프로젝트를 추가했을 때 예산을 초과하지 않는지 확인
                count += d[i]; // 지원할 수 있는 프로젝트의 비용 누적
                answer++; // 가능한 프로젝트 개수 증가
            } else {
                break; // 예산을 초과하면 반복문 종료
            }
        }
        return answer;
    }
}
