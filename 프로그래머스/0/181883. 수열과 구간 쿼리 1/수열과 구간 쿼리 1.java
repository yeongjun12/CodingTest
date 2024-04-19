import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            for (int i = start; i <= end; i++) {
                if (i >= 0 && i < arr.length) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
