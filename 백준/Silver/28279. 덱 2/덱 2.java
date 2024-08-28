import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Deque<Integer> dq = new LinkedList<>();
    	
    	int count = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		String str = strArr[0];
    		int num = (str.equals("1")||str.equals("2")) ? Integer.parseInt(strArr[1]) : -1;
    		
    		switch(str) {
    		case "1" : dq.offerFirst(num);
    			break;
    		case "2" : dq.offerLast(num);
    			break;
    		case "3" : 
    			if(!dq.isEmpty()) {
    				wr.write(dq.pollFirst()+"\n");
    			}else {
    				wr.write(-1+"\n");
    			}
    			break;
    		case "4" :
    			if(!dq.isEmpty()) {
    				wr.write(dq.pollLast()+"\n");
    			}else {
    				wr.write(-1+"\n");
    			}
    			break;
    		case "5" :
    			wr.write(dq.size()+"\n");
    			break;
    		case "6" :
    			if(dq.isEmpty()) {
    				wr.write(1+"\n");
    			}else {
    				wr.write(0+"\n");
    			}
    			break;
    		case "7" :
    			if(!dq.isEmpty()) {
    				wr.write(dq.peekFirst()+"\n");
    			}else {
    				wr.write(-1+"\n");
    			}
    			break;
    		case "8" :
    			if(!dq.isEmpty()) {
    				wr.write(dq.peekLast()+"\n");
    			}else {
    				wr.write(-1+"\n");
    			}
    			break;
    		}
    	}
    	wr.flush();
    	wr.close();
    	br.close();
    }
}