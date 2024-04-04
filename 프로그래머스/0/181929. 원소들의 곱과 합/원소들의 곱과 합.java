class Solution {
    public int solution(int[] num_list) {
        int sum = 0; // 합을 저장할 변수 초기화
        int product = 1; // 곱의 결과 담는 변수
        int sumSquared = 0; // 합의 제곱 결과를 담는 변수
        
        for(int i : num_list){
            product *= i;
            sum+=i;
        }        
        sumSquared = (int) Math.pow(sum, 2);
        
       return sumSquared > product ? 1 : 0;
    
    }
}
