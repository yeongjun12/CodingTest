import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        int[][] arr = new int[count][2];
        
        for(int i = 0; i < count; i++) {
        	String[] str = br.readLine().split(" ");
        	arr[i][0] = Integer.parseInt(str[0]);
        	arr[i][1] = Integer.parseInt(str[1]);
        }
        
        Arrays.sort(arr,(e1,e2)->{
        	if(e1[0] == e2[0]) {
        		return e1[1] - e2[1];
        	}else {
        		return e1[0] - e2[0];
        	}
        });
        
        for(int i = 0; i < count; i++) {
        	System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
