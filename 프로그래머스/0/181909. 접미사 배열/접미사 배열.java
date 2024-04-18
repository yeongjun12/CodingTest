import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] my_stringArr = my_string.split("");
        String[] answer = new String[my_string.length()];
        StringBuilder sb = new StringBuilder();
        
        for(int i=my_stringArr.length-1; i>=0; i--){
            sb.insert(0,my_stringArr[i]);
            answer[i] = sb.toString();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}