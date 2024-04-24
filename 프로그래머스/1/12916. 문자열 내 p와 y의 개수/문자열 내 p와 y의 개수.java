class Solution {
    boolean solution(String s) {
        s = s.toLowerCase(); 
        int pCount = 0;
        int yCount = 0;
        
        for(char ch : s.toCharArray()) { 
            if(ch == 'p') {
                pCount++;
            } else if(ch == 'y') {
                yCount++;
            }
        }
        
        return pCount == yCount; // 조건식을 그대로 반환하여 answer 변수를 사용하지 않고 간단히 리턴
    }
}
