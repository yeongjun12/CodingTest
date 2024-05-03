class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.parseLong(p);
        int pLength = p.length();
        
        for(int i=0; i<=t.length() - pLength; i++){
         if(pNum >= Long.parseLong(t.substring(i,i+pLength))) answer++;    
        }
        
        return answer;
    }
}