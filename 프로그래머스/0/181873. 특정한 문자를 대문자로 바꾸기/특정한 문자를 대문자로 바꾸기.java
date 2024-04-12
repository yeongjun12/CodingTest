class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.contains(alp) ? my_string.replace(alp, Character.toUpperCase(alp.charAt(0)) + "") : my_string;
        return answer;
    }
}