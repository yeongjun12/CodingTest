import java.util.Date;

class Solution {
    public int solution(int[] date1Arr, int[] date2Arr) {
        int answer = 0;
        
        Date date1 = new Date(date1Arr[0],date1Arr[1],date1Arr[2]);
        Date date2 = new Date(date2Arr[0],date2Arr[1],date2Arr[2]);
        
        answer = date1.compareTo(date2) == -1 ? 1 : 0; 
        
        
        return answer;
    }
}