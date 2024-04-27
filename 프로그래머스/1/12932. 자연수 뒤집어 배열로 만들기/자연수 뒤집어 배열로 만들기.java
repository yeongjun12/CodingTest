class Solution {
    public int[] solution(long n) {
        String s = n+"";
        String[] arr = s.split("");
        
        int[] answer = new int[arr.length];
        for(int i=arr.length; i>0; i--){
            answer[arr.length - i] = Integer.parseInt(arr[i - 1]);
        }
        return answer;
    }
}