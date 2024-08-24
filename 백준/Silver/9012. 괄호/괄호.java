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
    	Stack<Character> stack = new Stack<>();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		wr.write(stackSolve(br.readLine()) + "\n");
    	}
    	
    	wr.flush();
    	wr.close();
    	br.close();
    }
    
    
    public static String stackSolve(String str) {
    	
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		
    		if(ch == '(') {
    			stack.push('(');
    		}else if(stack.empty()){
    			return "NO";
    		}
    		else {
    			stack.pop();
    		}
    	}
    	
    	if(stack.empty()) {
    		return "YES";
    	}else {
    		return "NO";
    	}
    }
}
