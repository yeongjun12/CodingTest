class Solution {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        
        
        int min = Integer.parseInt(strArray[0]); 
        int max = Integer.parseInt(strArray[0]);
        
         for(String str : strArray){
             int num = Integer.parseInt(str);
             
             min = Math.min(min, num);
             max = Math.max(max, num);       
         }
        
        String answer = min+ " " + max;
        return answer;
    }
}