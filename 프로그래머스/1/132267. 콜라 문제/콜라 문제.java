class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            // n 개의 빈 병으로 얻을 수 있는 콜라 병 수
            int newBottles = (n / a) * b;
            // 이번에 얻은 콜라 병 수를 정답에 추가
            answer += newBottles;
            // 남은 빈 병 수를 업데이트
            n = (n % a) + newBottles;
        }

        return answer;
    }
}
