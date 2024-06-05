class Solution {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        
        
        int min = Integer.parseInt(strArray[0]); 
        int max = Integer.parseInt(strArray[0]);
        
         for(int i = 0; i < strArray.length; i++){
             if(Integer.parseInt(strArray[i]) > max){
                 max = Integer.parseInt(strArray[i]);
             } 
            
             if(Integer.parseInt(strArray[i]) < min){
                 min = Integer.parseInt(strArray[i]);
             } 
         }
        
        String answer = min+ " " + max;
        return answer;
    }
}