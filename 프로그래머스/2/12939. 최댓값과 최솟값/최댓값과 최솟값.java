class Solution {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        
        // 입력이 없는 경우 처리
        if (strArray.length == 0) {
            return "";
        }
        
        // 초기화를 첫 번째 값으로 설정
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        
        // 배열을 한 번만 반복하여 최소값과 최대값 찾기
        for (String str : strArray) {
            int num = Integer.parseInt(str);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}
