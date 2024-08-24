import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	int temp = 1;
    	Stack<Integer> stack = new Stack<>();
    	boolean result = false;
    	
    	for(int i = 0; i < n; i++) {
    		int num = Integer.parseInt(br.readLine());
    		for( ; temp <= num; temp++) {
    			stack.push(temp);
    			sb.append('+').append('\n');
    		}
    		if(stack.peek() == num) {
    			stack.pop();
    			sb.append('-').append('\n');
    		}else {
    			result = true;
    		}
    	}
    	if(result) {
			System.out.println("NO");
		}else {
			wr.write(sb.toString());
		}
    	wr.close();
		br.close();
    }
}
