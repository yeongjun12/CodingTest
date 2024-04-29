class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String str = "";
        
        for(int num : numbers){
            str += (num+"");
        }
        
        for(int i=0; i<=9; i++){
            if(!str.contains(i+"")){
                answer += i;
            }
        }
       
        return answer;
    }
}