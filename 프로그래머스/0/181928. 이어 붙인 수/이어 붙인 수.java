class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenString ="";
        String oddString = "";
        
        for(int num : num_list){
             if (num % 2 == 0) {
                 evenString += ""+num;
            } else {
                 oddString += ""+num;
            }
     
        }      
        answer = Integer.parseInt(evenString)+Integer.parseInt(oddString);
           
        return answer;
    }
}