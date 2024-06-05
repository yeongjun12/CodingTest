import java.util.Arrays;
import java.util.Comparator;

class Solution
{
    public int solution(int A[], int B[])
    {
        int sum = 0;
        
        Integer[] B2 = new Integer[B.length];
        
        for(int i = 0; i < B.length; i++){
            B2[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(B2, Comparator.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B2[i];
        }


        return sum;
    }
}