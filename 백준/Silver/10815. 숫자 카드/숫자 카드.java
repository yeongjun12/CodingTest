import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] NArray;
	static int[] MArray;
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
       StringBuilder sb = new StringBuilder();
       N = Integer.parseInt(br.readLine());
       NArray = new int[N];
       String[] NstrArr = br.readLine().split(" ");
       
       for(int i = 0; i < N; i++) {
    	   NArray[i] = Integer.parseInt(NstrArr[i]);
       }
       
       Arrays.sort(NArray);
       
       M = Integer.parseInt(br.readLine());
       int[] MArray = new int[M];
       String[] MstrArr = br.readLine().split(" ");
       
       for(int i = 0; i < M; i++) {
    	   int num = Integer.parseInt(MstrArr[i]);
    	   sb.append(BinarySearch(num)+" ");
       }
       
       wr.write(sb.toString().trim());
       wr.flush();
       wr.close();
       br.close();
       
    }
    
    public static int BinarySearch(int num) {
    	int left = 0;
    	int right = N-1;
    	
    	while(left<=right) {
    		int middle = (left+right)/2;
    		int middleValue = NArray[middle];
    		
    		if(num > middleValue) {
    			left = middle + 1;
    		}else if(num < middleValue){
    			right = middle - 1;
    		}else {
    			return 1;
    		}
    	}
    	return 0;
    }
}
