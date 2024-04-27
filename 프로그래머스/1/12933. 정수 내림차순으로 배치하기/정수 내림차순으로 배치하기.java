import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        
        Integer[] arr = new Integer[str.length()];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0'; //문자를 정수로
        }
        
        Arrays.sort(arr,Comparator.reverseOrder()); //Comparator 기본 데이터 타입에는 불가 그래서 Interger 사용
        
        for(int num : arr){
            sb.append(num+"");
        }
        
        answer = Long.parseLong(sb.toString());
        
        
        return answer;
    }
}