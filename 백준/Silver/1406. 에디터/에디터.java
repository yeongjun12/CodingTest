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
    	
    	Stack<Character> leftStack = new Stack<>();    	
    	Stack<Character> rightStack = new Stack<>();
    	StringBuilder sb = new StringBuilder();
    	String str = br.readLine();
    	
    	
    	for(int i = 0; i < str.length(); i++) {
    		leftStack.push(str.charAt(i));
    	}
    	
    	int count = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		
    		String flag = strArr[0];
    		char pushCh = (strArr.length > 1) ? strArr[1].charAt(0) : '-';
    		
    		
    		switch(flag) {
    		
    		case "L" : 
    				if(!leftStack.isEmpty()) {
    					rightStack.push(leftStack.pop());
    				}
    				break;
    		case "D" :
    				if(!rightStack.isEmpty()) {
    					leftStack.push(rightStack.pop());
    				}
    				break;
    		case "B" : 
    				if(!leftStack.isEmpty()) {
    					leftStack.pop();
    				}
    				break;
    		case "P" :
    				leftStack.push(pushCh);
    		}
    	}
    	
    	while(!leftStack.isEmpty()) {
    		rightStack.push(leftStack.pop());
    	}
    	
    	while(!rightStack.isEmpty()) {
    		sb.append(rightStack.pop());
    	}
    	
    	wr.write(sb.toString());
    	wr.flush();
    	wr.close();
    	br.close();
    	
    }
}