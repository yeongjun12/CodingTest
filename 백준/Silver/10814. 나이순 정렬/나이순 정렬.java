import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        String[][] arr = new String[count][2];
        
        for(int i = 0; i < count; i++) {
        	String[] strArr = br.readLine().split(" ");
        	arr[i][0] = strArr[0];
        	arr[i][1] = strArr[1];
        }
        
        Arrays.sort(arr, (s1,s2) -> {
        		return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        });
        
        for(int i = 0; i < count; i++) {
        	System.out.println(arr[i][0]+ " " + arr[i][1]);
        }
        
        
    }
}
