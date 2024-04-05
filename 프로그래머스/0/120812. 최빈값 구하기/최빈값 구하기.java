import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        // 각 값의 출현 빈도를 저장할 맵을 생성합니다.
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열을 반복하면서 각 값의 출현 빈도를 계산합니다.
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 최빈값과 그 빈도수를 저장할 변수를 초기화합니다.
        int mode = 0;
        int maxFrequency = 0;

        // 최빈값이 여러 개인지 확인하기 위한 변수입니다.
        boolean multipleModes = false;

        // 맵을 반복하면서 최빈값을 찾습니다.
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            // 현재 값의 빈도수가 최대 빈도수보다 높으면 최빈값을 갱신합니다.
            if (frequency > maxFrequency) {
                mode = num;
                maxFrequency = frequency;
                multipleModes = false; // 최빈값이 단 하나인 경우를 기본값으로 설정합니다.
            } else if (frequency == maxFrequency) {
                // 최빈값이 여러 개인 경우를 처리합니다.
                multipleModes = true;
            }
        }

        // 최빈값이 여러 개인 경우 -1을 반환합니다.
        if (multipleModes) {
            return -1;
        }

        // 최빈값을 반환합니다.
        return mode;
    }
}
