class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            if(x!=0){
            answer[i] = x + (x*i);    
            }else{
            answer[i] = 0;
            }
            
        } 
        return answer;
    }
}