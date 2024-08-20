import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        String[] NArray = new String[Integer.parseInt(input[0])];
        String[] MArray = new String[Integer.parseInt(input[1])];
        int count = 0;
        
        for(int i = 0; i < NArray.length; i++) {
        	NArray[i] = br.readLine();
        }
        
        for(int i = 0; i < MArray.length; i++) {
        	MArray[i] = br.readLine();
        }
        
        for(int i = 0; i < MArray.length; i++) {
        	for(int j = 0; j < NArray.length; j++) {
        		if(NArray[j].equals(MArray[i])) {
        			count++;
        		}
        	}
        }
        
        System.out.println(count);
        
    }
}
