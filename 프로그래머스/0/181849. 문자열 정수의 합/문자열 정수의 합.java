class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        char[] numChar = num_str.toCharArray();
        for(char ch : numChar){
            int num = (int) ch - '0';
            answer += num;
        }
        return answer;
    }
}