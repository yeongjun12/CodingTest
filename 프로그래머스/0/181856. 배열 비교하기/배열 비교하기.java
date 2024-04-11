class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            for (int num : arr1) { // 첫 번째 배열의 요소를 모두 더함
                sum1 += num;
            } 
            for (int num : arr2) { // 두 번째 배열의 요소를 모두 더함
                sum2 += num;
            }
            
            answer = sum1 > sum2 ? 1 : (sum1 < sum2 ? -1 : 0); // 합을 비교하여 결과를 설정
        }
        
        return answer;
    }
}
