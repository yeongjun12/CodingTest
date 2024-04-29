class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = s.length() / 2; // 중간 인덱스 계산
        
        // 문자열의 길이가 홀수인 경우에는 중간 문자를 포함하여 반환
        if(s.length() % 2 == 1){
            answer = s.substring(idx,idx+1);
        }
        // 문자열의 길이가 짝수인 경우에는 중간 문자를 포함하지 않고 반환
        else{
            answer = s.substring(idx-1, idx + 1);
        }
        
        return answer;
    }
}
