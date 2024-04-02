class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        char[] charArray = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = charArray.length-1; i >=0; i--) {
            sb.insert(0,charArray[i]);
            String str = sb.toString();
            if (str.equals(is_suffix)) {
                answer = 1;
                break; // 접미사를 찾았으면 더 이상 반복할 필요가 없음
            }
        }
        
        return answer;
    }
}
