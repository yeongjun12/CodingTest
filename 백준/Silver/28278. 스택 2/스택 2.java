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
    	
    	for(int i = 0 ; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		int num = Integer.parseInt(strArr[0]);
    		int pushNum = strArr.length > 1 ? Integer.parseInt(strArr[1]) : -1;
    		
    		switch(num) {
    		
    		case 1 : stack.push(pushNum);
    				break;
    		case 2 : 
    				if(stack.empty()) {
    				  wr.write(-1 + "\n");
    				}else {
    				  wr.write(stack.pop() + "\n");
    				}
    				break;
    		case 3 : 
    				wr.write(stack.size() + "\n");
    				break;
    		case 4 : 
    			 	wr.write(stack.isEmpty() ? "1\n" : "0\n");
    			 	break;
    		case 5 : 
    			 	wr.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
    		}
    	}
    	wr.flush();
		wr.close();
		br.close();
    }
}

