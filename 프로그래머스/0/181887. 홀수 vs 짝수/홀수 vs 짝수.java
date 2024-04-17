class Solution {
    public int solution(int[] num_list) {
        int sumEvenIndices = 0;
        int sumOddIndices = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                sumEvenIndices += num_list[i];
            } else {
                sumOddIndices += num_list[i];
            }
        }
        
        return Math.max(sumEvenIndices, sumOddIndices);
    }
}
