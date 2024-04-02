class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i<myString.length(); i++){
          
            char ch = myString.charAt(i);
            if(myString.charAt(i) == 'a'||myString.charAt(i) == 'A'){             
                sb.append(Character.toUpperCase(ch));
            } else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}