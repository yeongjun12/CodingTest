import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0 ; i < n; i++) {
    		String[] words = br.readLine().split(" ");
    		
    		for(String word : words) {
    			StringBuilder sb = new StringBuilder();
    			sb.append(word);
    			wr.write(sb.reverse()+ " ");
    		}
    		wr.write("\n");
    	}
    	
    	wr.flush();
    	wr.close();
    	br.close();
    }
    
}
