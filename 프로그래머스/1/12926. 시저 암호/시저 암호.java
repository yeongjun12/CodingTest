class Solution {
    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                charArray[i] = (char) ((ch - 'a' + n) % 26 + 'a');
            }
        }
    
        String answer = new String(charArray);
        return answer;
    }
}
