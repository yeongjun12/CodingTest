import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
		static int N, M;
		static int[] NArray;
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
         N = Integer.parseInt(br.readLine());
         NArray = new int[N];
        String[] strArray = br.readLine().split(" ");
        
        for(int i = 0; i < N; i++) {
        	NArray[i] = Integer.parseInt(strArray[i]);
        }
        
        Arrays.sort(NArray);
        
         M = Integer.parseInt(br.readLine());
         int[] MArray = new int[M];
         String[] mStrArr = br.readLine().split(" ");
         
         for(int i = 0; i < M; i++) {
        	 int result = BinarySearch(Integer.parseInt(mStrArr[i]));
        	 sb.append(result+" ");
         }
         System.out.println(sb.toString());
    }
    
    public static int BinarySearch(int num) {
    	int left = 0;
    	int right = N - 1;
    	
    	while(left <= right) {
    		int middle = (left+right)/2;
    		int middleValue = NArray[middle];
    		
    		if(num > middleValue) {
    			left = middle + 1;
    		}else if(num < middleValue) {
    			right = middle - 1;
    		}else { // num == middleValue 값을 찾은경우
    			return 1;
    		}
    	}
    	return 0; //상근이의 카드에 num이 없을 경우
    }
}
