import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Stack<Integer> stack = new Stack<>();
    	
    	int count = Integer.parseInt(br.readLine());
    	int sum = 0;
    	for(int i = 0; i < count; i++) {
    		int num = Integer.parseInt(br.readLine());
    		
    		if(num == 0) {
    			stack.pop();
    		}else {
    			stack.push(num);
    		}
    	}
    	
    	for(int num : stack) sum += num;
    	
    	wr.write(String.valueOf(sum));
    	wr.close();
    	br.close();
    }
}

