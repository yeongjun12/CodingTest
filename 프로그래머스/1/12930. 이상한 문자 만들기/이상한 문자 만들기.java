class Solution {
    public String solution(String s) {
        char strArr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i] == ' '){
                idx = 0;
                sb.append(strArr[i]);
            }else if(idx % 2 == 0){
                sb.append(Character.toUpperCase(strArr[i]));
                idx++;
            }else if(idx % 2 == 1){
                sb.append(Character.toLowerCase(strArr[i]));
                idx++;
            }   
        }
        return sb.toString();
    }
}
